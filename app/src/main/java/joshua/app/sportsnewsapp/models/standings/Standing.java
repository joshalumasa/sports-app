
package joshua.app.sportsnewsapp.models.standings;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Standing {

    @Expose
    private All all;
    @Expose
    private Away away;
    @Expose
    private String description;
    @Expose
    private String form;
    @Expose
    private Long goalsDiff;
    @Expose
    private String group;
    @Expose
    private Home home;
    @Expose
    private Long points;
    @Expose
    private Long rank;
    @Expose
    private String status;
    @Expose
    private Team team;
    @Expose
    private String update;

    public All getAll() {
        return all;
    }

    public void setAll(All all) {
        this.all = all;
    }

    public Away getAway() {
        return away;
    }

    public void setAway(Away away) {
        this.away = away;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Long getGoalsDiff() {
        return goalsDiff;
    }

    public void setGoalsDiff(Long goalsDiff) {
        this.goalsDiff = goalsDiff;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

}
