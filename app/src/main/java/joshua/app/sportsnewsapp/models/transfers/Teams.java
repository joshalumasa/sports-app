
package joshua.app.sportsnewsapp.models.transfers;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Teams {

    @Expose
    private In in;
    @Expose
    private Out out;

    public In getIn() {
        return in;
    }

    public void setIn(In in) {
        this.in = in;
    }

    public Out getOut() {
        return out;
    }

    public void setOut(Out out) {
        this.out = out;
    }

}
