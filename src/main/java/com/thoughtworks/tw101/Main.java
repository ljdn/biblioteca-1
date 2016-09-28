package com.thoughtworks.tw101;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tafarii on 9/27/16.
 */
public class Main {

    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        List<Book> books = new ArrayList<>();

        Menu menu = new Menu();
        Biblioteca biblioteca = new Biblioteca(printStream, books, menu);
        biblioteca.start();
    }
}
