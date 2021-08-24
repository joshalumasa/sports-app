
package joshua.app.sportsnewsapp.models.transfers;

import java.util.List;
import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Response {

    @Expose
    private Player player;
    @Expose
    private List<Transfer> transfers;
    @Expose
    private String update;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Transfer> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<Transfer> transfers) {
        this.transfers = transfers;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

}
