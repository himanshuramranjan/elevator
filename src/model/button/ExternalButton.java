package model;

public class ExternalButton implements Button {

    private final ButtonDispatcher dispatcher;

    public ExternalButton(ButtonDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public void pressButton(int floor, Direction direction) {

        dispatcher.submitRequest(new ElevatorRequest(floor, direction, null));
        System.out.println("Pressed " + direction + " from floor " + floor);
    }
}
