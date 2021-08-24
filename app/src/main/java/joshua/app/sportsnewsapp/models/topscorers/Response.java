
package joshua.app.sportsnewsapp.models.topscorers;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Response {

    @SerializedName("player")
    private Player mPlayer;
    @SerializedName("statistics")
    private List<Statistic> mStatistics;

    public Player getPlayer() {
        return mPlayer;
    }

    public void setPlayer(Player player) {
        mPlayer = player;
    }

    public List<Statistic> getStatistics() {
        return mStatistics;
    }

    public void setStatistics(List<Statistic> statistics) {
        mStatistics = statistics;
    }

}
