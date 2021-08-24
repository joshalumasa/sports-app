
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Goals {

    @SerializedName("assists")
    private Long mAssists;
    @SerializedName("conceded")
    private Long mConceded;
    @SerializedName("saves")
    private Object mSaves;
    @SerializedName("total")
    private Long mTotal;

    public Long getAssists() {
        return mAssists;
    }

    public void setAssists(Long assists) {
        mAssists = assists;
    }

    public Long getConceded() {
        return mConceded;
    }

    public void setConceded(Long conceded) {
        mConceded = conceded;
    }

    public Object getSaves() {
        return mSaves;
    }

    public void setSaves(Object saves) {
        mSaves = saves;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}
