package model;

public class ExternalButton extends Button {

    private final ButtonDispatcher buttonDispatcher;
    private Direction direction;

    public ExternalButton() {
        this.direction = Direction.NONE;
        this.buttonDispatcher = ExternalButtonDispatcher.getInstance();
    }

    public void pressButton(int floor, Direction direction) {

        System.out.println("Pressed " + direction + " from floor " + floor);
        this.direction = direction;
        buttonDispatcher.submitRequest(floor, direction);
    }
}
