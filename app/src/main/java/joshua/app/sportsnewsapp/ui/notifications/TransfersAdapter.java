package joshua.app.sportsnewsapp.ui.notifications;

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
import joshua.app.sportsnewsapp.models.transfers.Player;
import joshua.app.sportsnewsapp.models.transfers.Transfer;

public class TransfersAdapter extends RecyclerView.Adapter<TransfersAdapter.TransfersViewHolder>  {
    private Context mCtx;
    private List<Player> players;
    List<List<Transfer>> transfers;
    public TransfersAdapter(Context mCtx, List<Player> players, List<List<Transfer>> transfers) {
        this.mCtx = mCtx;
        this.players = players;
        this.transfers = transfers;
    }



    @Override
    public TransfersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.transfers_item, parent,false);

        return new TransfersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final TransfersViewHolder holder, final int position) {
        final Player model = players.get(position);
        holder.tvPlayerName.setText( model.getName());
        int trassize = transfers.get(position).size();

        Picasso.get().load(transfers.get(position).get(trassize-1).getTeams().getIn().getLogo()).into(holder.ivTeamOne);
        Picasso.get().load(transfers.get(position).get(trassize-1).getTeams().getOut().getLogo()).into(holder.ivTeamTwo);
        holder.tvDate.setText(transfers.get(position).get(trassize-1).getDate());
       holder.tvTeamOne.setText( transfers.get(position).get(trassize-1).getTeams().getIn().getName());
        holder.tvPlayerTeam.setText( transfers.get(position).get(trassize-1).getTeams().getOut().getName());

    }

    @Override
    public int getItemCount() {

        return players.size();
    }
    protected class TransfersViewHolder extends RecyclerView.ViewHolder {

        private MaterialTextView tvPlayerName,tvTeamOne,tvPlayerTeam,tvDate;
        private ImageView ivTeamOne,ivTeamTwo;


        public TransfersViewHolder(View itemView) {
            super(itemView);
            tvPlayerName=itemView.findViewById(R.id.tvPlayerName);
            tvTeamOne=itemView.findViewById(R.id.tvTeamOne);
            tvPlayerTeam = itemView.findViewById(R.id.tvPlayerTeam);
            tvDate = itemView.findViewById(R.id.tvDate);
            ivTeamOne = itemView.findViewById(R.id.ivTeamOne);
            ivTeamTwo = itemView.findViewById(R.id.ivTeamTwo);




        }
    }
}