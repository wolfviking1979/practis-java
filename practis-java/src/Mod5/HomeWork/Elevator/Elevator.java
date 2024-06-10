package Mod5.HomeWork.Elevator;

public class Elevator {
    private final int minFloor;
    private final int maxFloor;
    private int currentFloor = 0;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getMinFloor() {
        return minFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }


    private int moveUp() {
        currentFloor++;
        return currentFloor;
    }

    private int moveDown() {
        currentFloor--;
        return currentFloor;
    }

    public void move(int floor){
        if (floor > currentFloor) {
            moveUp();
        }
        if (floor < currentFloor){
            moveDown();
        }

    }
}
