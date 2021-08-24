
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Duels {

    @SerializedName("total")
    private Long mTotal;
    @SerializedName("won")
    private Long mWon;

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

    public Long getWon() {
        return mWon;
    }

    public void setWon(Long won) {
        mWon = won;
    }

}
