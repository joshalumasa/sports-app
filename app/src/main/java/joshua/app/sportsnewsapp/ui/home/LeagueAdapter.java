package joshua.app.sportsnewsapp.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;
import com.squareup.picasso.Picasso;

import java.util.List;
import joshua.app.sportsnewsapp.R;
import joshua.app.sportsnewsapp.models.Country;
import joshua.app.sportsnewsapp.models.League;
import joshua.app.sportsnewsapp.models.Season;

public class LeagueAdapter extends RecyclerView.Adapter<LeagueAdapter.LeagueViewHolder>  {
    private Context mCtx;
    private List<League> routesList;
    List<Country> countries;
    List<List<Season>> seasons;
    public LeagueAdapter(Context mCtx, List<League> routesList, List<Country> countries, List<List<Season>> seasons) {
        this.mCtx = mCtx;
        this.routesList = routesList;
        this.countries = countries;
        this.seasons = seasons;
    }



    @Override
    public LeagueViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.league, parent,false);

        return new LeagueViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final LeagueViewHolder holder, final int position) {
        final League model = routesList.get(position);



        Picasso.get().load(model.getLogo()).into(holder.ivLeague);

        holder.tvTitle.setText( model.getName());

//        String sea = "TODO";
        StringBuilder sea = new StringBuilder();
        List<Season> s = seasons.get(position);
        int length = s.size()-1;

        sea.append("Year: ").append(s.get(length).getYear()).append("\n").append("Start:").append(seasons.get(position).get(length).getStart()).append("\nEnd:").append(seasons.get(position).get(length).getEnd()).append("\n");
//        String desc = "Country: "+countries.get(position).getName()+"\n Type: "+model.getType()+"\nSeasons\n"+sea;
        holder.tvDesc.setText(sea);










    }

    @Override
    public int getItemCount() {

        return routesList.size();
    }
    protected class LeagueViewHolder extends RecyclerView.ViewHolder {

        private MaterialTextView tvTitle,tvDesc;
        private ImageView ivLeague;


        public LeagueViewHolder(View itemView) {
            super(itemView);
            tvTitle=itemView.findViewById(R.id.tvTitle);
            tvDesc=itemView.findViewById(R.id.tvDesc);
            ivLeague = itemView.findViewById(R.id.ivLeague);


        }
    }
}