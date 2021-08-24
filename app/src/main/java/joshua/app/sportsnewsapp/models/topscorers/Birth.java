
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Birth {

    @SerializedName("country")
    private String mCountry;
    @SerializedName("date")
    private String mDate;
    @SerializedName("place")
    private String mPlace;

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getPlace() {
        return mPlace;
    }

    public void setPlace(String place) {
        mPlace = place;
    }

}
