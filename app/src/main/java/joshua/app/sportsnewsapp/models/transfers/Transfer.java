
package joshua.app.sportsnewsapp.models.transfers;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Transfer {

    @Expose
    private String date;
    @Expose
    private Teams teams;
    @Expose
    private String type;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Teams getTeams() {
        return teams;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
