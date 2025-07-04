package model;

import enums.Direction;
import model.button.Button;
import model.button.InternalButton;
import model.buttondispatcher.InternalButtonDispatcher;

public class ElevatorCar {
    private final int id;
    private int curFloorNum;
    private final Display display;
    private final Button internalButton; // we can have List of Buttons and then we can iterate and press that btn
    private final ElevatorDoor elevatorDoor;
    private Direction direction;

    public ElevatorCar(int id) {
        this.id = id;
        this.curFloorNum = 0;
        this.display = new Display();
        this.internalButton = new InternalButton(new InternalButtonDispatcher(), id);
        this.elevatorDoor = new ElevatorDoor();
        this.direction = Direction.NONE;
    }

    public void move(int floor, Direction direction) {
        setDisplay(direction);
        System.out.println("Elevator " + id + " moving " + direction);
        System.out.println("Elevator " + id + " stops at floor " + floor);
        this.elevatorDoor.open(id);
        this.elevatorDoor.close(id);
        this.curFloorNum = floor;
    }

    public void pressButton(int floor) {
        if(floor > curFloorNum) internalButton.pressButton(floor, Direction.UP);
        else internalButton.pressButton(floor, Direction.DOWN);
    }

    private void setDisplay(Direction direction) {
        this.display.setDirection(direction);
        this.display.setFloorNumber(curFloorNum);
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setCurFloorNum(int curFloorNum) {
        this.curFloorNum = curFloorNum;
    }

    public int getId() {
        return id;
    }

    public int getCurFloorNum() {
        return curFloorNum;
    }

    public Display getDisplay() {
        return display;
    }

    public Button getInternalButton() {
        return internalButton;
    }

    public ElevatorDoor getElevatorDoor() {
        return elevatorDoor;
    }

    public Direction getDirection() {
        return direction;
    }
}
