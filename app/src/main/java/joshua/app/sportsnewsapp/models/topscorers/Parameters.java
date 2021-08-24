
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Parameters {

    @SerializedName("league")
    private String mLeague;
    @SerializedName("season")
    private String mSeason;

    public String getLeague() {
        return mLeague;
    }

    public void setLeague(String league) {
        mLeague = league;
    }

    public String getSeason() {
        return mSeason;
    }

    public void setSeason(String season) {
        mSeason = season;
    }

}
