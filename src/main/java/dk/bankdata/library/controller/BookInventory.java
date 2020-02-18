package dk.bankdata.library.controller;

import dk.bankdata.library.models.Book;
import dk.bankdata.library.models.Inventory;
import dk.bankdata.library.service.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/inventory")
@Validated
public class BookInventory {

    private InventoryService inventoryService;
    public BookInventory(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @RequestMapping(name = "get book list", method = RequestMethod.GET, value = "/bookList")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getInventoryList(){
        System.out.println("get request received");
        return inventoryService.getBookList();
    }

    @RequestMapping(method = RequestMethod.POST, name = "add book", value = "/addBook")
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@Validated @RequestBody Book book){
        System.out.println("inside post method add book "+book.toString());
        return inventoryService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.GET, name = "get particular book", value = "/book/{bookId}")
    @ResponseStatus(HttpStatus.OK)
    public Book addBook(@PathVariable("bookId") Integer bookId){
        System.out.println("inside post method add book "+bookId);
        return inventoryService.getBook(bookId);
    }
}
