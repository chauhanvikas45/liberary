package dk.bankdata.library.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.persistence.*;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "bookName",
        "authorName",
        "category",
        "bookPrice",
        "status"
})
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("bookName")
    private String bookName;
    @JsonProperty("authorName")
    private String authorName;
    @JsonProperty("category")
    private String category;
    @JsonProperty("bookPrice")
    private String bookPrice;
    @JsonProperty(value = "status")
    //@Column(columnDefinition = "varchar(50) default 'available'")
    private String status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("bookName")
    public String getBookName() {
        return bookName;
    }

    @JsonProperty("bookName")
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @JsonProperty("authorName")
    public String getAuthorName() {
        return authorName;
    }

    @JsonProperty("authorName")
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("bookPrice")
    public String getBookPrice() {
        return bookPrice;
    }

    @JsonProperty("bookPrice")
    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

}