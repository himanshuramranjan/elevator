package model;

import java.util.ArrayList;
import java.util.List;

public class InternalButton extends Button{
    private List<Integer> floors;

    public InternalButton() {
        floors = new ArrayList<>();
    }

    @Override
    public void pressButton(int floor, Direction direction, int elevatorId) {

        System.out.println("Pressed for floor : " + floor + " from elevator : " + elevatorId);
        floors.add(floor);
        InternalButtonDispatcher.submitRequest(floor, direction, elevatorId);

    }
}
