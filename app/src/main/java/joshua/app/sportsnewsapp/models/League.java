
package joshua.app.sportsnewsapp.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class League {

    @SerializedName("id")
    private Long mId;
    @SerializedName("logo")
    private String mLogo;
    @SerializedName("name")
    private String mName;
    @SerializedName("type")
    private String mType;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getLogo() {
        return mLogo;
    }

    public void setLogo(String logo) {
        mLogo = logo;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
