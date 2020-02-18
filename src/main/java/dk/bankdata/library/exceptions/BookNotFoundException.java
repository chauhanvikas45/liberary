package dk.bankdata.library.exceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Integer id){
        super("book id not found : "+id);
    }
}
