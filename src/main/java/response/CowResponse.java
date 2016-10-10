package response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Server response for Cow entity.
 */
public class CowResponse implements EntityResponse {
    private Long id;

    private String name;

    private String number;

    private String book;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "CET")
    private Date birth;

    private String parentName;

    private String parentNumber;

    private Integer lactationCount;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "CET")
    private Date lastLactationDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "CET")
    private Date lastInseminationDate;

    private String lastInseminationBullName;

    private String lastInseminationBullNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(String parentNumber) {
        this.parentNumber = parentNumber;
    }

    public Integer getLactationCount() {
        return lactationCount;
    }

    public void setLactationCount(Integer lactationCount) {
        this.lactationCount = lactationCount;
    }

    public Date getLastLactationDate() {
        return lastLactationDate;
    }

    public void setLastLactationDate(Date lastLactationDate) {
        this.lastLactationDate = lastLactationDate;
    }

    public Date getLastInseminationDate() {
        return lastInseminationDate;
    }

    public void setLastInseminationDate(Date lastInseminationDate) {
        this.lastInseminationDate = lastInseminationDate;
    }

    public String getLastInseminationBullName() {
        return lastInseminationBullName;
    }

    public void setLastInseminationBullName(String lastInseminationBullName) {
        this.lastInseminationBullName = lastInseminationBullName;
    }

    public String getLastInseminationBullNumber() {
        return lastInseminationBullNumber;
    }

    public void setLastInseminationBullNumber(String lastInseminationBullNumber) {
        this.lastInseminationBullNumber = lastInseminationBullNumber;
    }
}
