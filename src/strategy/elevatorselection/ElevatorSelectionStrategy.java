package strategy.elevatorselection;

import model.ElevatorRequest;
import service.ElevatorController;

import java.util.ArrayList;
import java.util.List;

public abstract class ElevatorSelectionStrategy {
    protected List<ElevatorController> elevatorControllers;

    protected ElevatorSelectionStrategy() {
        this.elevatorControllers = new ArrayList<>();
    }
    public abstract int selectElevator(ElevatorRequest elevatorRequest);
}
