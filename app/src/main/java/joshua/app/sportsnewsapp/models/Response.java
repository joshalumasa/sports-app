
package joshua.app.sportsnewsapp.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Response {

    @SerializedName("country")
    private Country mCountry;
    @SerializedName("league")
    private League mLeague;
    @SerializedName("seasons")
    private List<Season> mSeasons;

    public Country getCountry() {
        return mCountry;
    }

    public void setCountry(Country country) {
        mCountry = country;
    }

    public League getLeague() {
        return mLeague;
    }

    public void setLeague(League league) {
        mLeague = league;
    }

    public List<Season> getSeasons() {
        return mSeasons;
    }

    public void setSeasons(List<Season> seasons) {
        mSeasons = seasons;
    }

}
