
package joshua.app.sportsnewsapp.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Season {

    @SerializedName("coverage")
    private Coverage mCoverage;
    @SerializedName("current")
    private Boolean mCurrent;
    @SerializedName("end")
    private String mEnd;
    @SerializedName("start")
    private String mStart;
    @SerializedName("year")
    private Long mYear;

    public Coverage getCoverage() {
        return mCoverage;
    }

    public void setCoverage(Coverage coverage) {
        mCoverage = coverage;
    }

    public Boolean getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Boolean current) {
        mCurrent = current;
    }

    public String getEnd() {
        return mEnd;
    }

    public void setEnd(String end) {
        mEnd = end;
    }

    public String getStart() {
        return mStart;
    }

    public void setStart(String start) {
        mStart = start;
    }

    public Long getYear() {
        return mYear;
    }

    public void setYear(Long year) {
        mYear = year;
    }

}
