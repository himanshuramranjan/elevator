public class Floor {
    int floorNumber;
    Display display;
    ExternalButton floorButton;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.display = new Display();
        this.floorButton = new ExternalButton();
    }

    public void pressButton(Direction direction) {
        floorButton.pressButton(this.floorNumber, direction);
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Direction direction, int floorNumber) {
        this.display.setDirection(direction);
        this.floorNumber = floorNumber;
    }
}
