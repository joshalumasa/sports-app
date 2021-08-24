
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Penalty {

    @SerializedName("commited")
    private Object mCommited;
    @SerializedName("missed")
    private Long mMissed;
    @SerializedName("saved")
    private Object mSaved;
    @SerializedName("scored")
    private Long mScored;
    @SerializedName("won")
    private Object mWon;

    public Object getCommited() {
        return mCommited;
    }

    public void setCommited(Object commited) {
        mCommited = commited;
    }

    public Long getMissed() {
        return mMissed;
    }

    public void setMissed(Long missed) {
        mMissed = missed;
    }

    public Object getSaved() {
        return mSaved;
    }

    public void setSaved(Object saved) {
        mSaved = saved;
    }

    public Long getScored() {
        return mScored;
    }

    public void setScored(Long scored) {
        mScored = scored;
    }

    public Object getWon() {
        return mWon;
    }

    public void setWon(Object won) {
        mWon = won;
    }

}
