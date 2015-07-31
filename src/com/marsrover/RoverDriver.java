package com.marsrover;

public class RoverDriver {
    private String drivingInstructions;

    public RoverDriver() {
        this.drivingInstructions = "";
    }

    public boolean drive(Rover rover) {
        for (int instruction =  0; instruction < drivingInstructions.length(); instruction++) {
            char currentInstruction = drivingInstructions.charAt(instruction);

            if ((currentInstruction == 'L') || (currentInstruction == 'R')) {
                rover.takeTurn(currentInstruction);
            }
            else if (currentInstruction == 'M') {
                rover.move();
            }
        }
        return true;
    }

    public void acceptDrivingMap(String drivingDirection) {
        drivingInstructions = drivingDirection;
    }
}
