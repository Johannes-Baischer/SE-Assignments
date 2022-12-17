package mvc.controller;

import java.util.Collection;

import mvc.Main;
import mvc.model.BookManager;

/**
 * The controller for the BookManager
 * It will mostly be used to call methods on the BookManager directly
 */
public class BookManagerController {
    BookManager bookManager;

    public BookManagerController(String pathToModel) {
        //would load the model from the path in a real application

        //take the model from the main class
        this.bookManager = Main.bookManager;
    }

    public BookManagerController(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    public boolean addBook(String title, String author, String year, String isbn) {
        return bookManager.addBook(new Book(title, author, year, isbn));
    }

    public boolean removeBook(String isbn) {
        return bookManager.removeBook(isbn);
    }

    public boolean editBook(String isbn_to_edit, String title, String author, String year, String isbn) {
        return bookManager.editBook(isbn_to_edit, new Book(title, author, year, isbn));
    }

    public Collection<Book> getBooks() {
        return bookManager.getBooks();
    }

    public void addObserver(BookManagerObserver observer) {
        bookManager.addObserver(observer);
    }
}
