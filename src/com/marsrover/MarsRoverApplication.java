package com.marsrover;

public class MarsRoverApplication {
    View view;

    public MarsRoverApplication(View view) {
        this.view = view;
    }

    public void start() {
        view.initializeEnvironment();
    }
}
