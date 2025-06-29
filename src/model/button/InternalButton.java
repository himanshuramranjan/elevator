package model.button;

import model.buttondispatcher.ButtonDispatcher;
import enums.Direction;
import model.ElevatorRequest;

public class InternalButton implements Button {
    private final int elevatorId;
    private final ButtonDispatcher dispatcher;

    public InternalButton(ButtonDispatcher dispatcher, int elevatorId) {
        this.elevatorId = elevatorId;
        this.dispatcher = dispatcher;
    }

    @Override
    public void pressButton(int floor, Direction direction) {
        System.out.println("Pressed for floor : " + floor + " from elevator : " + elevatorId);
        dispatcher.submitRequest(new ElevatorRequest(floor, direction, elevatorId));
    }
}
