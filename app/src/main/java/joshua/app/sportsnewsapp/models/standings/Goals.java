
package joshua.app.sportsnewsapp.models.standings;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Goals {

    @Expose
    private Long against;
    @Expose
    private Long f;

    public Long getAgainst() {
        return against;
    }

    public void setAgainst(Long against) {
        this.against = against;
    }

    public Long getFor() {
        return f;
    }

    public void setFor(Long f) {
        this.f = f;
    }

}
