
package joshua.app.sportsnewsapp.models.transfers;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Parameters {

    @Expose
    private String player;

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

}
