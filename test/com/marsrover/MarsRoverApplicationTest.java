package com.marsrover;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class MarsRoverApplicationTest {

    @Test
    public void applicationShouldInitializeRoverOnStart() throws Exception {
        View view =Mockito.mock(View.class);
        MarsRoverApplication application = new MarsRoverApplication(view);

        application.execute();

        Mockito.verify(view).initializeRover();
    }

    @Test
    public void applicationShouldGetDrivingInstructionsOnStart() throws Exception {
        View view =Mockito.mock(View.class);
        MarsRoverApplication application = new MarsRoverApplication(view);

        application.execute();

        Mockito.verify(view).provideDrivingDirection();
    }

    @Test
    public void applicationShouldStartMissionOnStart() throws Exception {
        View view =Mockito.mock(View.class);
        MarsRoverApplication application = new MarsRoverApplication(view);

        application.execute();

        Mockito.verify(view).startMission();
    }

    @Test
    public void applicationShouldDisplayRoverPositionAfterMissionEnds() throws Exception {
        View view =Mockito.mock(View.class);
        MarsRoverApplication application = new MarsRoverApplication(view);

        application.execute();

        Mockito.verify(view).displayRoverPosition();
    }
}