package joshua.app.sportsnewsapp.ui.seasons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.List;

import joshua.app.sportsnewsapp.R;

public class SeasonsAdapter extends RecyclerView.Adapter<SeasonsAdapter.SeasonsViewHolder>  {
    private Context mCtx;
    private List<Long> seasons;
    public SeasonsAdapter(Context ctx, List<Long> seasons) {
        this.mCtx = mCtx;
        this.seasons = seasons;
    }



    @Override
    public SeasonsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.season_item, parent,false);

        return new SeasonsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final SeasonsViewHolder holder, final int position) {
        final String model = seasons.get(position).toString();
        holder.tvSeasons.setText("Season Year  "+model);
    }

    @Override
    public int getItemCount() {

        return seasons.size();
    }
    protected static class SeasonsViewHolder extends RecyclerView.ViewHolder {

        private MaterialTextView tvSeasons;


        public SeasonsViewHolder(View itemView) {
            super(itemView);
            tvSeasons=itemView.findViewById(R.id.tvSeasons);

        }
    }
}