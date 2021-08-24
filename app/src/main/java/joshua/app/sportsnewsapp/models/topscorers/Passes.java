
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Passes {

    @SerializedName("accuracy")
    private Long mAccuracy;
    @SerializedName("key")
    private Long mKey;
    @SerializedName("total")
    private Long mTotal;

    public Long getAccuracy() {
        return mAccuracy;
    }

    public void setAccuracy(Long accuracy) {
        mAccuracy = accuracy;
    }

    public Long getKey() {
        return mKey;
    }

    public void setKey(Long key) {
        mKey = key;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}
