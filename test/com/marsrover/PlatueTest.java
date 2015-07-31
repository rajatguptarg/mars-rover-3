package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlatueTest {

    @Test
    public void checkRoverIsInsidePlatue() throws Exception {
        Platue platue = new Platue();
        Rover rover = new Rover();

        platue.initializeBoundary(5, 5);
        rover.initializeRoverPosition(2, 3, 1);

        assertEquals(true, platue.isPresent(rover));

    }
}
