
package joshua.app.sportsnewsapp.models.standings;

import java.util.List;
import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class League {

    @Expose
    private String country;
    @Expose
    private String flag;
    @Expose
    private Long id;
    @Expose
    private String logo;
    @Expose
    private String name;
    @Expose
    private Long season;
    @Expose
    private List<List<Standing>> standings;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSeason() {
        return season;
    }

    public void setSeason(Long season) {
        this.season = season;
    }

    public List<List<Standing>> getStandings() {
        return standings;
    }

    public void setStandings(List<List<Standing>> standings) {
        this.standings = standings;
    }

}
