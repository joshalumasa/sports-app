
package joshua.app.sportsnewsapp.seasons;

import java.util.List;
import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class SeasonsResponse {

    @Expose
    private List<Object> errors;
    @Expose
    private String get;
    @Expose
    private Paging paging;
    @Expose
    private List<Object> parameters;
    @Expose
    private List<Long> response;
    @Expose
    private Long results;

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public List<Object> getParameters() {
        return parameters;
    }

    public void setParameters(List<Object> parameters) {
        this.parameters = parameters;
    }

    public List<Long> getResponse() {
        return response;
    }

    public void setResponse(List<Long> response) {
        this.response = response;
    }

    public Long getResults() {
        return results;
    }

    public void setResults(Long results) {
        this.results = results;
    }

}
