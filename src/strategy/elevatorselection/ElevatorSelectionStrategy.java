package strategy.elevatorselection;

import model.Direction;
import model.ElevatorController;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSelectionStrategy {
    protected List<ElevatorController> elevatorControllers;

    public ElevatorSelectionStrategy() {
        this.elevatorControllers = new ArrayList<>();
    }
    public int selectElevator(int floor, Direction direction) { return -1; }
}
