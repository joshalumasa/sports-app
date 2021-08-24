package joshua.app.sportsnewsapp.ui.standings;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import joshua.app.sportsnewsapp.R;
import joshua.app.sportsnewsapp.models.standings.Standing;
import joshua.app.sportsnewsapp.models.standings.StandingsResponse;
import joshua.app.sportsnewsapp.ui.home.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;

public class StandingsFragment extends Fragment {
    private Context ctx;
    private RecyclerView recyclerView;

    private ProgressBar progressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_standings, container, false);
        ctx = container.getContext();
       progressBar = root.findViewById(R.id.progressloading);
        recyclerView = root.findViewById(R.id.recyclerplayer);
        getStandings();
        return root;
    }

    private void getStandings() {
        progressBar.setVisibility(View.VISIBLE);
        Call<StandingsResponse> call = RetrofitClient.getInstance().getMyApi().getMStandings();
        call.enqueue(new Callback<StandingsResponse>() {
            @Override
            public void onResponse(Call<StandingsResponse> call, retrofit2.Response<StandingsResponse> response) {
                assert response.body() != null;
                int size = response.body().getResponse().size();
                List<Standing> standings = new ArrayList<>();
                for (int i = 0; i < size; i++) {

                    int standingsize = response.body().getResponse().get(i).getLeague().getStandings().size();
                    for (int j= 0;j<standingsize;j++){
                        int finalstands = response.body().getResponse().get(i).getLeague().getStandings().get(j).size();
                        for (int k=0;k<finalstands;k++){
                            standings.add(response.body().getResponse().get(i).getLeague().getStandings().get(j).get(k));

                        }
                    }
                }


                loadItemsToRecycler(standings);

                Log.d("Response", "onResponse: "+response.body().getResponse());



            }

            @Override
            public void onFailure(Call<StandingsResponse> call, Throwable t) {
                Log.d("Response", "onResponse: "+t.getMessage());

                progressBar.setVisibility(View.GONE);
                Toast.makeText(getContext(), "An error has occured"+t.getMessage(), Toast.LENGTH_LONG).show();


            }




        });
    }
    private void loadItemsToRecycler(List<Standing> standings) {
        StandingsAdapter mAdapter = new StandingsAdapter(ctx,standings);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(ctx,1);
        layoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        recyclerView.startLayoutAnimation();
        progressBar.setVisibility(View.GONE);
    }

}