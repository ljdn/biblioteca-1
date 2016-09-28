package com.thoughtworks.tw101;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tafarii on 9/27/16.
 */
public class Biblioteca {


    private PrintStream printStream;
    private List<String> books;

    public Biblioteca(PrintStream printStream, List<String> books) {
        this.printStream = printStream;
        this.books = books;
    }

    public void start() {

        printStream.println("Welcome!");

        for (int i = 0; i < books.size(); i++) {
            printStream.println(books.get(i));
        }
    }
}
