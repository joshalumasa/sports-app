
package joshua.app.sportsnewsapp.models.transfers;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class In {

    @Expose
    private Long id;
    @Expose
    private String logo;
    @Expose
    private String name;

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

}
