package joshua.app.sportsnewsapp.ui.seasons;

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

import java.util.List;

import joshua.app.sportsnewsapp.R;
import joshua.app.sportsnewsapp.seasons.SeasonsResponse;
import joshua.app.sportsnewsapp.ui.home.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;

public class SeasonsFragment extends Fragment {
private Context ctx;
private RecyclerView recyclerView;
private ProgressBar progressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_seasons, container, false);
        ctx = container.getContext();
        progressBar = root.findViewById(R.id.progressloading);
        recyclerView = root.findViewById(R.id.recyclerplayer);
        getSeasons();

        return root;
    }


    private void getSeasons() {
        progressBar.setVisibility(View.VISIBLE);
        Call<SeasonsResponse> call = RetrofitClient.getInstance().getMyApi().getSeasons();
        call.enqueue(new Callback<SeasonsResponse>() {
            @Override
            public void onResponse(Call<SeasonsResponse> call, retrofit2.Response<SeasonsResponse> response) {
                assert response.body() != null;
//                int size = response.body().getResponse().size();
//                List<String> seasons = new ArrayList<>();
//
//                for (int i = 0; i < size; i++) {
//                    seasons.add(response.body().getResponse().get(i).toString());
//                }


                loadItemsToRecycler(response.body().getResponse());

                Log.d("Response", "onResponse: "+response.body().getResponse());



            }

            @Override
            public void onFailure(Call<SeasonsResponse> call, Throwable t) {
                Log.d("Response", "onResponse: "+t.getMessage());

                progressBar.setVisibility(View.GONE);
                Toast.makeText(getContext(), "An error has occured"+t.getMessage(), Toast.LENGTH_LONG).show();


            }




        });
    }
    private void loadItemsToRecycler(List<Long> seasons) {
        SeasonsAdapter mAdapter = new SeasonsAdapter(ctx,seasons);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(ctx,1);
        layoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        recyclerView.startLayoutAnimation();
        progressBar.setVisibility(View.GONE);
    }

}