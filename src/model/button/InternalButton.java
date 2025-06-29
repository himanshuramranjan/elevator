package model;

import java.util.ArrayList;
import java.util.List;

public class InternalButton implements Button {
    private List<Integer> floors;
    private final int elevatorId;
    private final ButtonDispatcher dispatcher;

    public InternalButton(ButtonDispatcher dispatcher, int elevatorId) {

        floors = new ArrayList<>();
        this.elevatorId = elevatorId;
        this.dispatcher = dispatcher;
    }

    @Override
    public void pressButton(int floor, Direction direction) {

        floors.add(floor);
        dispatcher.submitRequest(new ElevatorRequest(floor, direction, elevatorId));
        System.out.println("Pressed for floor : " + floor + " from elevator : " + elevatorId);
    }
}
