
package joshua.app.sportsnewsapp.models.transfers;

import java.util.List;
import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class TransfersResponse {

    @Expose
    private List<Object> errors;
    @Expose
    private String get;
    @Expose
    private Paging paging;
    @Expose
    private Parameters parameters;
    @Expose
    private List<Response> response;
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

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public Long getResults() {
        return results;
    }

    public void setResults(Long results) {
        this.results = results;
    }

}
