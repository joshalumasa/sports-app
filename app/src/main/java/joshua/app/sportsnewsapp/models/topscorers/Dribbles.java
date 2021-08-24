
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Dribbles {

    @SerializedName("attempts")
    private Long mAttempts;
    @SerializedName("past")
    private Object mPast;
    @SerializedName("success")
    private Long mSuccess;

    public Long getAttempts() {
        return mAttempts;
    }

    public void setAttempts(Long attempts) {
        mAttempts = attempts;
    }

    public Object getPast() {
        return mPast;
    }

    public void setPast(Object past) {
        mPast = past;
    }

    public Long getSuccess() {
        return mSuccess;
    }

    public void setSuccess(Long success) {
        mSuccess = success;
    }

}
