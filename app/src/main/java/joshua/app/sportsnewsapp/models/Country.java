
package joshua.app.sportsnewsapp.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Country {

    @SerializedName("code")
    private Object mCode;
    @SerializedName("flag")
    private Object mFlag;
    @SerializedName("name")
    private String mName;

    public Object getCode() {
        return mCode;
    }

    public void setCode(Object code) {
        mCode = code;
    }

    public Object getFlag() {
        return mFlag;
    }

    public void setFlag(Object flag) {
        mFlag = flag;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}
