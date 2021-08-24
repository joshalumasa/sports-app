
package joshua.app.sportsnewsapp.models.standings;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Parameters {

    @Expose
    private String league;
    @Expose
    private String season;

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

}
