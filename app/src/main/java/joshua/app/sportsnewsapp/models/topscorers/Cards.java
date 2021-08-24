
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Cards {

    @SerializedName("red")
    private Long mRed;
    @SerializedName("yellow")
    private Long mYellow;
    @SerializedName("yellowred")
    private Long mYellowred;

    public Long getRed() {
        return mRed;
    }

    public void setRed(Long red) {
        mRed = red;
    }

    public Long getYellow() {
        return mYellow;
    }

    public void setYellow(Long yellow) {
        mYellow = yellow;
    }

    public Long getYellowred() {
        return mYellowred;
    }

    public void setYellowred(Long yellowred) {
        mYellowred = yellowred;
    }

}
