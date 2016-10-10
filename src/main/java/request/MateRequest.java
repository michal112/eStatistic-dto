package request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * User request for Mate entity.
 */
public class MateRequest implements EntityRequest {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "CET")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
