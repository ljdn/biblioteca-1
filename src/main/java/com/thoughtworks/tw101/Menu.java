package com.thoughtworks.tw101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by tafarii on 9/28/16.
 */
public class Menu {
    private PrintStream printStream;
    private Biblioteca biblioteca;
    private BufferedReader bufferedReader;

    public Menu(PrintStream printStream, Biblioteca biblioteca, BufferedReader bufferedReader) {
        this.printStream = printStream;
        this.biblioteca = biblioteca;
        this.bufferedReader = bufferedReader;
    }

    public void display() {
        printStream.println("1: List Books");
        printStream.println("Please select an option");

        try {
            if(bufferedReader.readLine().equals("1")){
                biblioteca.listBooks();
            }
            else{
                printStream.println("Select a valid option!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
