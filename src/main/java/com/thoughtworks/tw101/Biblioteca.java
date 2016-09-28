package com.thoughtworks.tw101;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tafarii on 9/27/16.
 */
public class Biblioteca {
    private List<Book> books;

    public Biblioteca(List<Book> books) {
        this.books = books;
    }

    public void listBooks() {
        for (Book book : books) {
            book.display();
        }
    }
}
