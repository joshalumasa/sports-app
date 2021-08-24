
package joshua.app.sportsnewsapp.models.topscorers;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Substitutes {

    @SerializedName("bench")
    private Long mBench;
    @SerializedName("in")
    private Long mIn;
    @SerializedName("out")
    private Long mOut;

    public Long getBench() {
        return mBench;
    }

    public void setBench(Long bench) {
        mBench = bench;
    }

    public Long getIn() {
        return mIn;
    }

    public void setIn(Long in) {
        mIn = in;
    }

    public Long getOut() {
        return mOut;
    }

    public void setOut(Long out) {
        mOut = out;
    }

}
