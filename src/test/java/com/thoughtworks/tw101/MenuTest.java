package com.thoughtworks.tw101;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by tafarii on 9/28/16.
 */
public class MenuTest {
    PrintStream printStream;
    Menu menu;
    private Biblioteca biblioteca;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        bufferedReader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        biblioteca = mock(Biblioteca.class);
        menu = new Menu(printStream, biblioteca, bufferedReader);
    }

    @Test
    public void shouldDisplayOptionListBooksWhenMenuIsDisplayed() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1");
        menu.display();
        verify(printStream).println("1: List Books");
    }

    @Test
    public void shouldPrintPromptWhenMenuIsDisplayed() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1");
        menu.display();
        verify(printStream).println("Please select an option");
    }

    @Test
    public void shouldListBooksWhenUserInputsOne() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1");
        menu.display();
        verify(biblioteca).listBooks();
    }
}
