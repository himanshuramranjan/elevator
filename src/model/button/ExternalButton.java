package model.button;

import model.buttondispatcher.ButtonDispatcher;
import enums.Direction;
import model.ElevatorRequest;

public class ExternalButton implements Button {

    private final ButtonDispatcher dispatcher;

    public ExternalButton(ButtonDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public void pressButton(int floor, Direction direction) {
        System.out.println("Pressed " + direction + " from floor " + floor);
        dispatcher.submitRequest(new ElevatorRequest(floor, direction, null));
    }
}
