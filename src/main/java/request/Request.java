package request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User request object.
 * e.g. {
 *      "request": {
 *          "name": "cow",
 *          ...
 *      }}
 */
public class Request<T extends EntityRequest> {

    @JsonProperty(value = "request")
    private T requestContent;

    public T getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(T requestContent) {
        this.requestContent = requestContent;
    }
}
