package com.marsrover;

public class Platue {
    private int boundaryX;
    private int boundaryY;

    public Platue() {
        this.boundaryX = 0;
        this.boundaryY = 0;
    }

    public void initializeBoundary(int boundaryX, int boundaryY) {
        this.boundaryX = boundaryX;
        this.boundaryY = boundaryY;
    }

    public boolean isPresent(Rover rover) {
        int roverXPosition = Character.getNumericValue(rover.position().charAt(0));
        int roverYPosition = Character.getNumericValue(rover.position().charAt(2));

        if ((roverXPosition > boundaryX) || (roverYPosition > boundaryY)) {
            return false;
        }
        return true;
    }
}
