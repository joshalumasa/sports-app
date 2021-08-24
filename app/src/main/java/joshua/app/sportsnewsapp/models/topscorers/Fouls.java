
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Fouls {

    @SerializedName("committed")
    private Long mCommitted;
    @SerializedName("drawn")
    private Long mDrawn;

    public Long getCommitted() {
        return mCommitted;
    }

    public void setCommitted(Long committed) {
        mCommitted = committed;
    }

    public Long getDrawn() {
        return mDrawn;
    }

    public void setDrawn(Long drawn) {
        mDrawn = drawn;
    }

}
