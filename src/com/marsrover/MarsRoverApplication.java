package com.marsrover;

public class MarsRoverApplication {
    private View view;
    private int turns;

    public MarsRoverApplication(View view) {
        this.view = view;
        turns = 2;
    }

    public void start() {
        view.initializePlatue();
        while (turns-- > 0) {
            view.initializeRover();
            view.provideDrivingDirection();
            view.startMission();
        }
    }
}
