
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class League {

    @SerializedName("country")
    private String mCountry;
    @SerializedName("flag")
    private String mFlag;
    @SerializedName("id")
    private Long mId;
    @SerializedName("logo")
    private String mLogo;
    @SerializedName("name")
    private String mName;
    @SerializedName("season")
    private Long mSeason;

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getFlag() {
        return mFlag;
    }

    public void setFlag(String flag) {
        mFlag = flag;
    }

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

    public Long getSeason() {
        return mSeason;
    }

    public void setSeason(Long season) {
        mSeason = season;
    }

}
