
package joshua.app.sportsnewsapp.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Coverage {

    @SerializedName("fixtures")
    private Fixtures mFixtures;
    @SerializedName("injuries")
    private Boolean mInjuries;
    @SerializedName("odds")
    private Boolean mOdds;
    @SerializedName("players")
    private Boolean mPlayers;
    @SerializedName("predictions")
    private Boolean mPredictions;
    @SerializedName("standings")
    private Boolean mStandings;
    @SerializedName("top_assists")
    private Boolean mTopAssists;
    @SerializedName("top_cards")
    private Boolean mTopCards;
    @SerializedName("top_scorers")
    private Boolean mTopScorers;

    public Fixtures getFixtures() {
        return mFixtures;
    }

    public void setFixtures(Fixtures fixtures) {
        mFixtures = fixtures;
    }

    public Boolean getInjuries() {
        return mInjuries;
    }

    public void setInjuries(Boolean injuries) {
        mInjuries = injuries;
    }

    public Boolean getOdds() {
        return mOdds;
    }

    public void setOdds(Boolean odds) {
        mOdds = odds;
    }

    public Boolean getPlayers() {
        return mPlayers;
    }

    public void setPlayers(Boolean players) {
        mPlayers = players;
    }

    public Boolean getPredictions() {
        return mPredictions;
    }

    public void setPredictions(Boolean predictions) {
        mPredictions = predictions;
    }

    public Boolean getStandings() {
        return mStandings;
    }

    public void setStandings(Boolean standings) {
        mStandings = standings;
    }

    public Boolean getTopAssists() {
        return mTopAssists;
    }

    public void setTopAssists(Boolean topAssists) {
        mTopAssists = topAssists;
    }

    public Boolean getTopCards() {
        return mTopCards;
    }

    public void setTopCards(Boolean topCards) {
        mTopCards = topCards;
    }

    public Boolean getTopScorers() {
        return mTopScorers;
    }

    public void setTopScorers(Boolean topScorers) {
        mTopScorers = topScorers;
    }

}
