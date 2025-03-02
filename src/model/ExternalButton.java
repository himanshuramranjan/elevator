package model;

public class ExternalButton extends Button {

    private Direction direction;

    public ExternalButton() {
        this.direction = Direction.NONE;
    }

    public void pressButton(int floor, Direction direction) {

        this.direction = direction;
        ExternalButtonDispatcher.submitRequest(floor, direction);
        System.out.println("Pressed " + this.direction + " from floor " + floor);
    }
}
