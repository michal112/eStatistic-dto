package response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Server response object.
 * e.g. {
 *      "response": {
 *          "id": 1,
 *          ...
 *      }}
 */
public class Response {
    @JsonProperty(value = "response")
    private Object responseContent;

    public Object getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(Object responseContent) {
        this.responseContent = responseContent;
    }
}
