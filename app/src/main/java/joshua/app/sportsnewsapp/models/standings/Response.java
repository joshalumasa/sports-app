
package joshua.app.sportsnewsapp.models.standings;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Response {

    @Expose
    private League league;

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

}
