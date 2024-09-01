package Library_manegment_system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void addBook() {
        Library library = new Library();
        Book book = new Book("1234567890", "The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979);
        library.addBook(book);
        assertEquals(1, library.getAvailableBooks().size());
    }

    @Test
    void borrowBook() {
        Library library = new Library();
        Book book = new Book("1234567890", "The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979);
        library.addBook(book);

        assertTrue(library.borrowBook("1234567890"));
        assertFalse(library.borrowBook("1234567890"));
    }

    // Add more test cases for returning books and viewing available books
}
