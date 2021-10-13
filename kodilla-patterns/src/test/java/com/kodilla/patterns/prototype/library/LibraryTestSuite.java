package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
     void testGetBooks() {
        //Given
        Library library = new Library("HORROR");
        library.getBooks().add(new Book("The Shining", "S.King", LocalDate.of(1977, 5, 10)));
        library.getBooks().add(new Book("Cujo", "S.King", LocalDate.of(1981, 5, 10)));
        library.getBooks().add(new Book("Pet Sematary", "S.King", LocalDate.of(1983, 5, 10)));
        library.getBooks().add(new Book("It", "S.King", LocalDate.of(1986, 5, 10)));
        library.getBooks().add(new Book("The Needful Things", "S.King", LocalDate.of(1991, 5, 10)));

        // shallow copy
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("FANTASY");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("SENSATION");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(new Book("Cujo", "S.King", LocalDate.of(1981, 5, 10)));

        //Then
        System.out.println(library.getBooks().size());
        assertEquals(4, library.getBooks().size());
        assert shallowClonedLibrary != null;
        assertEquals(4, shallowClonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
        assertEquals(shallowClonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
