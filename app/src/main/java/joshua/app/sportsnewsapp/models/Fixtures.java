
package joshua.app.sportsnewsapp.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Fixtures {

    @SerializedName("events")
    private Boolean mEvents;
    @SerializedName("lineups")
    private Boolean mLineups;
    @SerializedName("statistics_fixtures")
    private Boolean mStatisticsFixtures;
    @SerializedName("statistics_players")
    private Boolean mStatisticsPlayers;

    public Boolean getEvents() {
        return mEvents;
    }

    public void setEvents(Boolean events) {
        mEvents = events;
    }

    public Boolean getLineups() {
        return mLineups;
    }

    public void setLineups(Boolean lineups) {
        mLineups = lineups;
    }

    public Boolean getStatisticsFixtures() {
        return mStatisticsFixtures;
    }

    public void setStatisticsFixtures(Boolean statisticsFixtures) {
        mStatisticsFixtures = statisticsFixtures;
    }

    public Boolean getStatisticsPlayers() {
        return mStatisticsPlayers;
    }

    public void setStatisticsPlayers(Boolean statisticsPlayers) {
        mStatisticsPlayers = statisticsPlayers;
    }

}
