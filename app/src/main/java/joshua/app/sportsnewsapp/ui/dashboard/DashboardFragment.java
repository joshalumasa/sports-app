package joshua.app.sportsnewsapp.ui.dashboard;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import joshua.app.sportsnewsapp.R;
import joshua.app.sportsnewsapp.databinding.FragmentDashboardBinding;
import joshua.app.sportsnewsapp.models.topscorers.Player;
import joshua.app.sportsnewsapp.models.topscorers.Statistic;
import joshua.app.sportsnewsapp.models.topscorers.TopScorersResponse;
import joshua.app.sportsnewsapp.ui.home.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private FragmentDashboardBinding binding;
    private RecyclerView recyclerplayer;

    private ProgressBar progressBar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        recyclerplayer = root.findViewById(R.id.recyclerplayer);
       progressBar = root.findViewById(R.id.progressloading);
        getTopScorers();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void getTopScorers() {
progressBar.setVisibility(View.VISIBLE);
Call<TopScorersResponse> call = RetrofitClient.getInstance().getMyApi().getTopScorers();
        call.enqueue(new Callback<TopScorersResponse>() {
            @Override
            public void onResponse(@NonNull Call<TopScorersResponse> call, retrofit2.Response<TopScorersResponse> response) {

                Log.d("Top", "onResponse: "+response);
             if (response.body()!=null){
                 int size = response.body().getResponse().size();
                 List<Player>  players = new ArrayList<>();
                 List<List<Statistic>> statistics = new ArrayList<>();
                 for (int i = 0; i < size; i++) {
                     players.add(response.body().getResponse().get(i).getPlayer());
                     statistics.add(response.body().getResponse().get(i).getStatistics());

                 }


                 loadItemsToRecycler(players,statistics);

                 Log.d("Response", "onResponse: "+response.body());
             }



            }

            @Override
            public void onFailure(Call<TopScorersResponse> call, Throwable t) {
                Log.d("Response", "onResponse: "+t.getMessage());

                Toast.makeText(getContext(), "An error has occured"+t.getMessage(), Toast.LENGTH_LONG).show();
                progressBar.setVisibility(View.GONE);


            }




        });
    }
    private void loadItemsToRecycler(List<Player> players, List<List<Statistic>> statistics) {
        TopScorersAdapter mAdapter = new TopScorersAdapter(binding.getRoot().getContext(),players,statistics);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(binding.getRoot().getContext(),1);
        layoutManager.setItemPrefetchEnabled(true);
        recyclerplayer.setLayoutManager(layoutManager);
        recyclerplayer.setAdapter(mAdapter);
        recyclerplayer.startLayoutAnimation();
        progressBar.setVisibility(View.GONE);
    }

}