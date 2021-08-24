package joshua.app.sportsnewsapp.ui.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;
import com.squareup.picasso.Picasso;

import java.util.List;

import joshua.app.sportsnewsapp.R;
import joshua.app.sportsnewsapp.models.topscorers.Player;
import joshua.app.sportsnewsapp.models.topscorers.Statistic;
import de.hdodenhof.circleimageview.CircleImageView;

public class TopScorersAdapter extends RecyclerView.Adapter<TopScorersAdapter.TopScorersViewHolder>  {
    private Context mCtx;
    List<Player> players;
    List<List<Statistic>> statistics;
    public TopScorersAdapter(Context context, List<Player> players, List<List<Statistic>> statistics) {
        this.mCtx = mCtx;
        this.players = players;
        this.statistics = statistics;
    }



    @Override
    public TopScorersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.top_scorer_item, parent,false);

        return new TopScorersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final TopScorersViewHolder holder, final int position) {
        final Player model = players.get(position);
        Picasso.get().load(model.getPhoto()).into(holder.ivPlayerIcon);
        holder.tvPlayerName.setText( model.getName());
        int playerposition = position+1;
        holder.tvPlayerPosition.setText(""+playerposition);
        holder.tvPlayerGoals.setText("Goals: "+statistics.get(position).get(0).getGoals().getTotal());
        holder.tvPlayerTeam.setText("Team: "+statistics.get(position).get(0).getTeam().getName());

    }

    @Override
    public int getItemCount() {

        return players.size();
    }
    protected class TopScorersViewHolder extends RecyclerView.ViewHolder {

        private MaterialTextView tvPlayerPosition,tvPlayerName,tvPlayerTeam,tvPlayerGoals;
        private CircleImageView ivPlayerIcon;


        public TopScorersViewHolder(View itemView) {
            super(itemView);
            tvPlayerPosition=itemView.findViewById(R.id.tvPlayerPosition);
            tvPlayerName=itemView.findViewById(R.id.tvPlayerName);
            tvPlayerTeam = itemView.findViewById(R.id.tvPlayerTeam);

            tvPlayerGoals = itemView.findViewById(R.id.tvPlayerGoals);
            ivPlayerIcon = itemView.findViewById(R.id.ivPlayerIcon);

        }
    }
}