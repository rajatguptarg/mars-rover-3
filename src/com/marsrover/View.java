package com.marsrover;

import java.util.Scanner;

public class View {
    Platue platue;
    Rover rover;
    RoverDriver driver;

    public View() {
        this.platue = new Platue();
        this.rover =  new Rover();
        this.driver = new RoverDriver();
    }

    String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void initializeRover() {
        String[] roverInfo = getInput().split("\\s+");
        int x = Integer.parseInt(roverInfo[0]);
        int y = Integer.parseInt(roverInfo[1]);
        int direction = Integer.parseInt(roverInfo[2]);

        rover.initializeRoverPosition(x, y, direction);
    }

    public void initializePlatue() {
        String[] platueBoundary = getInput().split("\\s+");
        int boundaryX = Integer.parseInt(platueBoundary[0]);
        int boundaryY = Integer.parseInt(platueBoundary[1]);

        platue.initializeBoundary(boundaryX, boundaryY);
    }

    public void provideDrivingDirection() {
        String drivingDirection = getInput();

        driver.acceptDrivingMap(drivingDirection);
    }

    public void startMission() {
        driver.drive(rover);
    }

    public void displayRoverPosition() {
        if (platue.isPresent(rover)) {
            System.out.println(rover.position());
        }
        else {
            System.out.println("Rover Cashed!!");
        }
    }
}
