package model;

import enums.Direction;
import model.button.Button;
import model.button.ExternalButton;
import model.buttondispatcher.ExternalButtonDispatcher;

public class Floor {
    private final int floorId;
    private final Display display;
    private final Button floorButton;

    public Floor(int floorId) {
        this.floorId = floorId;
        this.display = new Display();
        this.floorButton = new ExternalButton(new ExternalButtonDispatcher());
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

    //called everytime selected elevator moves each floor (need to be configured)
    public void setDisplay(Direction direction, int floorNumber) {
        this.display.setDirection(direction);
        this.display.setFloorNumber(floorNumber);
    }
}
