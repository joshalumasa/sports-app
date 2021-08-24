
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Team {

    @SerializedName("id")
    private Long mId;
    @SerializedName("logo")
    private String mLogo;
    @SerializedName("name")
    private String mName;

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

}
