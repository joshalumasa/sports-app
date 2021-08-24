
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Games {

    @SerializedName("appearences")
    private Long mAppearences;
    @SerializedName("captain")
    private Boolean mCaptain;
    @SerializedName("lineups")
    private Long mLineups;
    @SerializedName("minutes")
    private Long mMinutes;
    @SerializedName("number")
    private Object mNumber;
    @SerializedName("position")
    private String mPosition;
    @SerializedName("rating")
    private String mRating;

    public Long getAppearences() {
        return mAppearences;
    }

    public void setAppearences(Long appearences) {
        mAppearences = appearences;
    }

    public Boolean getCaptain() {
        return mCaptain;
    }

    public void setCaptain(Boolean captain) {
        mCaptain = captain;
    }

    public Long getLineups() {
        return mLineups;
    }

    public void setLineups(Long lineups) {
        mLineups = lineups;
    }

    public Long getMinutes() {
        return mMinutes;
    }

    public void setMinutes(Long minutes) {
        mMinutes = minutes;
    }

    public Object getNumber() {
        return mNumber;
    }

    public void setNumber(Object number) {
        mNumber = number;
    }

    public String getPosition() {
        return mPosition;
    }

    public void setPosition(String position) {
        mPosition = position;
    }

    public String getRating() {
        return mRating;
    }

    public void setRating(String rating) {
        mRating = rating;
    }

}
