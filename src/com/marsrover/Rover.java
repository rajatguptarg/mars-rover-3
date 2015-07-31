package com.marsrover;

public class Rover {
    private int x;
    private int y;
    private int facingTowards;
    private char[] compass = {'W', 'N', 'E', 'S'};

    public Rover() {
        this.x = 0;
        this.y = 0;
        this.facingTowards = 1;
    }

    public void initializeRoverPosition(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.facingTowards = direction;
    }

    public char takeTurn(char direction) {
        if (direction == 'L') {
            if (facingTowards == 0) {
                return 3;
            }
            return compass[facingTowards - 1];
        }
        return compass[(facingTowards + 1) % 4];
    }

    public boolean move() {
        if(facingTowards == 0) {
            x -= 1;
            return true;
        }
        else if (facingTowards == 1) {
            y += 1;
            return true;
        }
        else if (facingTowards == 2) {
            x += 1;
            return true;
        }
        else if (facingTowards == 3) {
            y -= 1;
            return true;
        }
        else {
            return false;
        }
    }

    public String position() {
        return (x + " " + y + " " + compass[facingTowards]);
    }
}

