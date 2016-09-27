package com.thoughtworks.tw101;

import java.io.PrintStream;

/**
 * Created by tafarii on 9/27/16.
 */
public class Biblioteca {


    private PrintStream printStream;

    public Biblioteca(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void start() {

        printStream.println("Welcome!");
    }
}
