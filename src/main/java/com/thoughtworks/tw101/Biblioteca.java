package com.thoughtworks.tw101;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tafarii on 9/27/16.
 */
public class Biblioteca {


    private PrintStream printStream;
    private List<Book> books;

    public Biblioteca(PrintStream printStream, List<Book> books) {
        this.printStream = printStream;
        this.books = books;
    }

    public void start() {

        printStream.println("Welcome!");

        for (Book book : books) {
            book.display();
        }
    }
}
