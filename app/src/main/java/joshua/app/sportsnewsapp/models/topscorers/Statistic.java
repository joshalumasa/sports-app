
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Statistic {

    @SerializedName("cards")
    private Cards mCards;
    @SerializedName("dribbles")
    private Dribbles mDribbles;
    @SerializedName("duels")
    private Duels mDuels;
    @SerializedName("fouls")
    private Fouls mFouls;
    @SerializedName("games")
    private Games mGames;
    @SerializedName("goals")
    private Goals mGoals;
    @SerializedName("league")
    private League mLeague;
    @SerializedName("passes")
    private Passes mPasses;
    @SerializedName("penalty")
    private Penalty mPenalty;
    @SerializedName("shots")
    private Shots mShots;
    @SerializedName("substitutes")
    private Substitutes mSubstitutes;
    @SerializedName("tackles")
    private Tackles mTackles;
    @SerializedName("team")
    private Team mTeam;

    public Cards getCards() {
        return mCards;
    }

    public void setCards(Cards cards) {
        mCards = cards;
    }

    public Dribbles getDribbles() {
        return mDribbles;
    }

    public void setDribbles(Dribbles dribbles) {
        mDribbles = dribbles;
    }

    public Duels getDuels() {
        return mDuels;
    }

    public void setDuels(Duels duels) {
        mDuels = duels;
    }

    public Fouls getFouls() {
        return mFouls;
    }

    public void setFouls(Fouls fouls) {
        mFouls = fouls;
    }

    public Games getGames() {
        return mGames;
    }

    public void setGames(Games games) {
        mGames = games;
    }

    public Goals getGoals() {
        return mGoals;
    }

    public void setGoals(Goals goals) {
        mGoals = goals;
    }

    public League getLeague() {
        return mLeague;
    }

    public void setLeague(League league) {
        mLeague = league;
    }

    public Passes getPasses() {
        return mPasses;
    }

    public void setPasses(Passes passes) {
        mPasses = passes;
    }

    public Penalty getPenalty() {
        return mPenalty;
    }

    public void setPenalty(Penalty penalty) {
        mPenalty = penalty;
    }

    public Shots getShots() {
        return mShots;
    }

    public void setShots(Shots shots) {
        mShots = shots;
    }

    public Substitutes getSubstitutes() {
        return mSubstitutes;
    }

    public void setSubstitutes(Substitutes substitutes) {
        mSubstitutes = substitutes;
    }

    public Tackles getTackles() {
        return mTackles;
    }

    public void setTackles(Tackles tackles) {
        mTackles = tackles;
    }

    public Team getTeam() {
        return mTeam;
    }

    public void setTeam(Team team) {
        mTeam = team;
    }

}
