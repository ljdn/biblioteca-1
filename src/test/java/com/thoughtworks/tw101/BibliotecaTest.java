package com.thoughtworks.tw101;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tafarii on 9/27/16.
 */
public class BibliotecaTest {
    @Test
    public void shouldDisplayWelcomeMessageWhenApplicationStarts() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        Biblioteca biblioteca = new Biblioteca(printStream);


        biblioteca.start();

        verify(printStream).println("Welcome!");
    }
}