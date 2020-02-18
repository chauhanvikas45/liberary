package dk.bankdata.library.service;

import dk.bankdata.library.models.Book;
import dk.bankdata.library.repository.BookRepository;
import dk.bankdata.library.repository.InventoryRespository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {

    private InventoryRespository inventoryRespository;
    private BookRepository bookRepository;
    public InventoryServiceImpl(InventoryRespository inventoryRespository,
                                BookRepository bookRepository) {
        this.inventoryRespository = inventoryRespository;
        this.bookRepository =  bookRepository;
    }

    @Override
    public List<Book> getBookList() {
        List<Book> booklist = inventoryRespository.findAll();

        booklist.stream().forEach(System.out::print);
        System.out.println("get------- "+booklist.size());
        return booklist;
    }

    @Override
    public Book addBook(Book book) {
        Book bookResponse = new Book();
        System.out.println("11----------"+book.toString());
        bookResponse = inventoryRespository.save(book);
        System.out.println("22---------"+bookResponse.toString());
        bookResponse = bookRepository.save(book);
        //Optional.ofNullable(book1).orElseThrow(new BookNotFoundException);
        return  bookResponse;


    }

    @Override
    public Book getBook(Integer bookId) {
        Optional<Book> book;
        book = inventoryRespository.findById(bookId);
        System.out.println("booked returned ------"+book.get());
        return book.get();
    }
}
