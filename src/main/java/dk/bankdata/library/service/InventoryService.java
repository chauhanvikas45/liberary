package dk.bankdata.library.service;

import dk.bankdata.library.models.Book;

import java.util.List;


public interface InventoryService {
    List<Book> getBookList();

    Book addBook(Book book);
    Book getBook(Integer bookId);
}
