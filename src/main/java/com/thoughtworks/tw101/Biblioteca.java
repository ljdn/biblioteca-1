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
    private Menu menu;

    public Biblioteca(PrintStream printStream, List<Book> books, Menu menu) {
        this.printStream = printStream;
        this.books = books;
        this.menu = menu;
    }

    public void start() {

        printStream.println("Welcome!");

        menu.display();

        for (Book book : books) {
            book.display();
        }
    }
}
