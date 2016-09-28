package com.thoughtworks.tw101;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tafarii on 9/28/16.
 */
public class MenuTest {
    @Test
    public void shouldDisplayOptionListBooksWhenMenuIsDisplayed() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        Menu menu = new Menu(printStream);
        menu.display();
        verify(printStream).println("List Books");
    }
}
