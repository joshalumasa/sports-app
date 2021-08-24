package joshua.app.sportsnewsapp.ui.standings;

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
import joshua.app.sportsnewsapp.models.standings.Standing;

public class StandingsAdapter extends RecyclerView.Adapter<StandingsAdapter.StandingsViewHolder>  {
    private Context mCtx;
    private List<Standing> standings;
    public StandingsAdapter(Context ctx, List<Standing> standings) {
        this.mCtx = mCtx;
        this.standings = standings;
    }



    @Override
    public StandingsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.standing_item, parent,false);
        return new StandingsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final StandingsViewHolder holder, final int position) {
        Standing  sta = standings.get(position);
        holder.tvStandingsName.setText(sta.getRank()+". "+sta.getTeam().getName());
        String slug = sta.getDescription()+"\nPoints: "+sta.getPoints()+"\nGoal Difference: "+sta.getGoalsDiff()+
                "\nGroup: "+sta.getGroup()+"Game Statistics\n\nGames Played: "+sta.getAll().getPlayed()+
                "\nWins: "+sta.getAll().getWin()+"\t\tDrew: "+sta.getAll().getDraw()+"\t\tLost:"+sta.getAll().getLose()+
                "Home\nWon"+sta.getHome().getWin()+"\t\tDrew: "+sta.getHome().getDraw()+"\t\tLost: "+sta.getHome().getLose()+
                "Away\nWon"+sta.getAway().getWin()+"\t\tDrew: "+sta.getAway().getDraw()+"\t\tLost: "+sta.getAway().getLose();
        holder.tvStandingsSlug.setText(slug);
        Picasso.get().load(sta.getTeam().getLogo()).placeholder(R.drawable.ic_baseline_sports_baseball_24).into(holder.ivStandings);
    }

    @Override
    public int getItemCount() {

        return standings.size();
    }
    protected static class StandingsViewHolder extends RecyclerView.ViewHolder {

        private MaterialTextView tvStandingsName,tvStandingsSlug;
        private ImageView ivStandings;


        public StandingsViewHolder(View itemView) {
            super(itemView);
            tvStandingsName=itemView.findViewById(R.id.tvStandingsName);
            tvStandingsSlug=itemView.findViewById(R.id.tvStandingsSlug);
            ivStandings=itemView.findViewById(R.id.ivStandings);


        }
    }
}