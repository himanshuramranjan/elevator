package strategy.elevatorcontrol;

import model.ElevatorRequest;
import service.ElevatorController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class ElevatorControllerStrategy {

    protected Queue<ElevatorRequest> pendingRequests;
    protected List<ElevatorController> elevatorControllers;

    protected ElevatorControllerStrategy() {
        this.pendingRequests = new LinkedList<>();
        this.elevatorControllers = new ArrayList<>();
    }

    public void addRequest(ElevatorRequest pendingRequests) {
        this.pendingRequests.add(pendingRequests);
    }

    public abstract void moveElevatorCar(ElevatorController elevatorController);
}
