package com.marsrover;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ViewTest {
    @Test
    public void userShouldBeAbleToGiveOption() {
        View view = Mockito.mock(View.class);

        Mockito.when(view.getInput()).thenReturn("5 5");

        assertEquals("5 5", view.getInput());
    }
}