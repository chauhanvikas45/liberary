package dk.bankdata.library.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//@Entity
public class Inventory{

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //@JsonProperty(value= "bookId")
    private  Book book ;
    //@JsonProperty(value = "bookStatus")
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Book getBooklist() {
        return book;
    }

    public void setBooklist(Book booklist) {
        this.book = booklist;
    }
}
