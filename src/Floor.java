public class Floor {
    private final int floorId;
    private final Display display;
    private final ExternalButton floorButton;

    public Floor(int floorId) {
        this.floorId = floorId;
        this.display = new Display();
        this.floorButton = new ExternalButton();
    }

    public void pressButton(Direction direction) {
        floorButton.pressButton(this.floorId, direction);
    }

    public int getFloorId() {
        return floorId;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Direction direction, int floorNumber) {
        this.display.setDirection(direction);
        this.display.setFloorNumber(floorNumber);
    }
}
