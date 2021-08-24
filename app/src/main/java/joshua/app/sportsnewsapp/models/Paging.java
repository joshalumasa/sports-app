
package joshua.app.sportsnewsapp.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Paging {

    @SerializedName("current")
    private Long mCurrent;
    @SerializedName("total")
    private Long mTotal;

    public Long getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Long current) {
        mCurrent = current;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}
