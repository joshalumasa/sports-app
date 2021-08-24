
package joshua.app.sportsnewsapp.models.transfers;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Paging {

    @Expose
    private Long current;
    @Expose
    private Long total;

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}
