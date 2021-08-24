package joshua.app.sportsnewsapp.ui.notifications;

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
import joshua.app.sportsnewsapp.databinding.FragmentNotificationsBinding;
import joshua.app.sportsnewsapp.models.transfers.Player;
import joshua.app.sportsnewsapp.models.transfers.Transfer;
import joshua.app.sportsnewsapp.models.transfers.TransfersResponse;
import joshua.app.sportsnewsapp.ui.home.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private FragmentNotificationsBinding binding;
    private RecyclerView recyclerplayer;

    private ProgressBar progressBar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
       progressBar = root.findViewById(R.id.progressloading);
        recyclerplayer = root.findViewById(R.id.recyclerplayer);
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
        Call<TransfersResponse> call = RetrofitClient.getInstance().getMyApi().getTransfers();
        call.enqueue(new Callback<TransfersResponse>() {
            @Override
            public void onResponse(@NonNull Call<TransfersResponse> call, retrofit2.Response<TransfersResponse> response) {
                Log.d("Top", "onResponse: "+response);
                if (response.body()!=null){
                    int size = response.body().getResponse().size();
                    List<joshua.app.sportsnewsapp.models.transfers.Player> players = new ArrayList<>();
                    List<List<Transfer>> transfers = new ArrayList<>();
                    for (int i = 0; i < size; i++) {
                        players.add(response.body().getResponse().get(i).getPlayer());
                        transfers.add(response.body().getResponse().get(i).getTransfers());

                    }


                    loadItemsToRecycler(players,transfers);

                    Log.d("Response", "onResponse: "+response.body());
                }



            }

            @Override
            public void onFailure(Call<TransfersResponse> call, Throwable t) {
                Log.d("Response", "onResponse: "+t.getMessage());

                Toast.makeText(getContext(), "An error has occured"+t.getMessage(), Toast.LENGTH_LONG).show();

                progressBar.setVisibility(View.GONE);
            }




        });
    }
    private void loadItemsToRecycler(List<Player> players, List<List<Transfer>> transfers) {
        TransfersAdapter mAdapter = new TransfersAdapter(binding.getRoot().getContext(),players,transfers);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(binding.getRoot().getContext(),1);
        layoutManager.setItemPrefetchEnabled(true);
        recyclerplayer.setLayoutManager(layoutManager);
        recyclerplayer.setAdapter(mAdapter);
        recyclerplayer.startLayoutAnimation();
        progressBar.setVisibility(View.GONE);
    }

}