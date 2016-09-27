package com.thoughtworks.tw101;

import java.io.PrintStream;

/**
 * Created by tafarii on 9/27/16.
 */
public class Main {

    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        Biblioteca biblioteca = new Biblioteca(printStream);
        biblioteca.start();
    }
}
