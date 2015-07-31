package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void roverShouldBeAbleToTakeTurns() throws Exception {
        Rover rover = new Rover();

        rover.initializeRoverPosition(0, 0, 1);

        assertEquals('W', rover.takeTurn('L'));
    }

    @Test
    public void roverShouldBeAbleToMove() throws Exception {
        Rover rover = new Rover();

        rover.initializeRoverPosition(0, 0, 1);

        assertEquals(true, rover.move());
    }

    @Test
    public void roverShouldTellItsPosition() throws Exception {
        Rover rover = new Rover();

        rover.initializeRoverPosition(1, 1, 1);

        assertEquals("1 1 N", rover.position());

    }

}
