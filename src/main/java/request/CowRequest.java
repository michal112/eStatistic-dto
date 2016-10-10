package request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * User request for Cow entity.
 */
public class CowRequest implements EntityRequest {
    private String name;

    private String number;

    private String book;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "CET")
    private Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String bookName) {
        this.book = bookName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
