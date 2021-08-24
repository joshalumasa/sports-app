
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Player {

    @SerializedName("age")
    private Long mAge;
    @SerializedName("birth")
    private Birth mBirth;
    @SerializedName("firstname")
    private String mFirstname;
    @SerializedName("height")
    private String mHeight;
    @SerializedName("id")
    private Long mId;
    @SerializedName("injured")
    private Boolean mInjured;
    @SerializedName("lastname")
    private String mLastname;
    @SerializedName("name")
    private String mName;
    @SerializedName("nationality")
    private String mNationality;
    @SerializedName("photo")
    private String mPhoto;
    @SerializedName("weight")
    private String mWeight;

    public Long getAge() {
        return mAge;
    }

    public void setAge(Long age) {
        mAge = age;
    }

    public Birth getBirth() {
        return mBirth;
    }

    public void setBirth(Birth birth) {
        mBirth = birth;
    }

    public String getFirstname() {
        return mFirstname;
    }

    public void setFirstname(String firstname) {
        mFirstname = firstname;
    }

    public String getHeight() {
        return mHeight;
    }

    public void setHeight(String height) {
        mHeight = height;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Boolean getInjured() {
        return mInjured;
    }

    public void setInjured(Boolean injured) {
        mInjured = injured;
    }

    public String getLastname() {
        return mLastname;
    }

    public void setLastname(String lastname) {
        mLastname = lastname;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNationality() {
        return mNationality;
    }

    public void setNationality(String nationality) {
        mNationality = nationality;
    }

    public String getPhoto() {
        return mPhoto;
    }

    public void setPhoto(String photo) {
        mPhoto = photo;
    }

    public String getWeight() {
        return mWeight;
    }

    public void setWeight(String weight) {
        mWeight = weight;
    }

}
