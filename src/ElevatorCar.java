public class ElevatorCar {
    int id;
    int curFloorNum;
    Display display;
    Button internalButton;
    ElevatorDoor elevatorDoor;
    Direction direction;

    public ElevatorCar(int id) {
        this.id = id;
        this.curFloorNum = 0;
        this.display = new Display();
        this.internalButton = new InternalButton();
        this.elevatorDoor = new ElevatorDoor();
        this.direction = Direction.NONE;
    }

    public void move(int floor, Direction direction) {
        System.out.println("Moving to : " + floor);
        setDisplay(direction);
    }

    public void pressButton(int floor) {
        if(floor > curFloorNum) internalButton.pressButton(floor, Direction.UP, id);
        else internalButton.pressButton(floor, Direction.DOWN, id);
    }

    private void setDisplay(Direction direction) {
        this.display.setDirection(direction);
        this.display.setFloorNumber(curFloorNum);
    }
}
