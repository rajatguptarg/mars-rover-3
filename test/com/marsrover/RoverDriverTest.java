package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoverDriverTest {

    @Test
    public void driverShouldBeAbleToMoveRover() throws Exception {
        RoverDriver driver = new RoverDriver();
        Rover rover = new Rover();

        rover.initializeRoverPosition(0, 0, 1);
        driver.acceptDrivingMap("RM");

        assertEquals(true, driver.drive(rover));
    }

}