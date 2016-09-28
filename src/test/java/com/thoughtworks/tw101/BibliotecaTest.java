package com.thoughtworks.tw101;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by tafarii on 9/27/16.
 */
public class BibliotecaTest {

    private PrintStream printStream;
    private Biblioteca biblioteca;
    private List<Book> books;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        books = new ArrayList<>();
        biblioteca = new Biblioteca(printStream, books);

    }

    @Test
    public void shouldDisplayWelcomeMessageWhenApplicationStarts() throws Exception {
        biblioteca.start();
        verify(printStream).println("Welcome!");
    }

    @Test
    public void shouldDisplayOneBookWhenStartingWithOneBook() throws Exception {
        Book book = mock(Book.class);
        books.add(book);
        biblioteca.start();
        verify(book).display();
    }

    @Test
    public void shouldDisplayTwoBooksWhenStartingWithTwoBooks() throws Exception {
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        books.add(book1);
        books.add(book2);
        biblioteca.start();
        verify(book1).display();
        verify(book2).display();
    }

}