package joshua.app.sportsnewsapp.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import joshua.app.sportsnewsapp.R;
import joshua.app.sportsnewsapp.databinding.FragmentHomeBinding;

import joshua.app.sportsnewsapp.models.Country;
import joshua.app.sportsnewsapp.models.League;
import joshua.app.sportsnewsapp.models.MyRes;
import joshua.app.sportsnewsapp.models.Season;
import retrofit2.Call;
import retrofit2.Callback;

public class HomeFragment extends Fragment {
    private CardView seasons;
    private CardView standings;

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    RecyclerView superListView;
    private Context ctx;
    private RelativeLayout rl;

    private ProgressBar progressBar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        assert container != null;
        ctx = container.getContext();
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        superListView = root.findViewById(R.id.myrcycler);
        seasons = root.findViewById(R.id.cardseasons);
        standings = root.findViewById(R.id.cardstandings);
        rl= root.findViewById(R.id.topbuttons);
        progressBar = root.findViewById(R.id.progressloading);
//        pd = new ProgressDialog(ctx);
//        pd.setTitle("Please wait");
//        pd.setMessage("Fetching information");

        Animation fallanim = AnimationUtils.loadAnimation(ctx, R.anim.fall_down);
        seasons.startAnimation(fallanim);
        standings.startAnimation(fallanim);


        seasons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.seasonsFragment);
            }
        });
        standings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.standingsFragment);

            }
        });
        getLeagues();

//        testLeagues();
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void getLeagues() {
//        pd.show();
        progressBar.setVisibility(View.VISIBLE);
        Call<MyRes> call = RetrofitClient.getInstance().getMyApi().getLeagues();
        call.enqueue(new Callback<MyRes>() {
            @Override
            public void onResponse(Call<MyRes> call, retrofit2.Response<MyRes> response) {
                assert response.body() != null;
                int size = response.body().getResponse().size();
                List<League>  leagues = new ArrayList<>();
                List<Country> countries = new ArrayList<>();
                List<List<Season>> seasons = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    leagues.add(response.body().getResponse().get(i).getLeague());
                    countries.add(response.body().getResponse().get(i).getCountry());
                    seasons.add(response.body().getResponse().get(i).getSeasons());

                }


                loadItemsToRecycler(leagues,countries,seasons);



            }

            @Override
            public void onFailure(Call<MyRes> call, Throwable t) {
                Log.d("Response", "onResponse: "+t.getMessage());

//                pd.dismiss();
                progressBar.setVisibility(View.GONE);

                Toast.makeText(getContext(), "An error has occured"+t.getMessage(), Toast.LENGTH_LONG).show();


            }




        });
    }
    private void loadItemsToRecycler(List<League> leagues, List<Country> countries, List<List<Season>> seasons) {
        LeagueAdapter mAdapter = new LeagueAdapter(ctx,leagues,countries,seasons);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(ctx,1);
        layoutManager.setItemPrefetchEnabled(true);
        superListView.setLayoutManager(layoutManager);
        superListView.setAdapter(mAdapter);
        superListView.startLayoutAnimation();
//        pd.dismiss();
        progressBar.setVisibility(View.GONE);

    }
}

