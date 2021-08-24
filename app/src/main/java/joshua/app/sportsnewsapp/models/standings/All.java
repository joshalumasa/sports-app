
package joshua.app.sportsnewsapp.models.standings;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class All {

    @Expose
    private Long draw;
    @Expose
    private Goals goals;
    @Expose
    private Long lose;
    @Expose
    private Long played;
    @Expose
    private Long win;

    public Long getDraw() {
        return draw;
    }

    public void setDraw(Long draw) {
        this.draw = draw;
    }

    public Goals getGoals() {
        return goals;
    }

    public void setGoals(Goals goals) {
        this.goals = goals;
    }

    public Long getLose() {
        return lose;
    }

    public void setLose(Long lose) {
        this.lose = lose;
    }

    public Long getPlayed() {
        return played;
    }

    public void setPlayed(Long played) {
        this.played = played;
    }

    public Long getWin() {
        return win;
    }

    public void setWin(Long win) {
        this.win = win;
    }

}
