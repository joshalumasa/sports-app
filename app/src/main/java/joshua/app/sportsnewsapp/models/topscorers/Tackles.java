
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Tackles {

    @SerializedName("blocks")
    private Long mBlocks;
    @SerializedName("interceptions")
    private Long mInterceptions;
    @SerializedName("total")
    private Long mTotal;

    public Long getBlocks() {
        return mBlocks;
    }

    public void setBlocks(Long blocks) {
        mBlocks = blocks;
    }

    public Long getInterceptions() {
        return mInterceptions;
    }

    public void setInterceptions(Long interceptions) {
        mInterceptions = interceptions;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}
