package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoverApplicationTest {

    @Test
    public void applicationShouldStart() throws Exception {
        View view = new View();
        MarsRoverApplication application = new MarsRoverApplication(view);

        assertEquals(true, application.start());
    }
}