package strategy.elevatorcontrol;

import model.ElevatorController;
import strategy.PendingRequest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ElevatorControllerStrategy {

    protected Queue<PendingRequest> pendingRequests;
    protected List<ElevatorController> elevatorControllers;

    public ElevatorControllerStrategy() {
        this.pendingRequests = new LinkedList<>();
        this.elevatorControllers = new ArrayList<>();
    }

    public void addRequest(PendingRequest pendingRequests) {
        this.pendingRequests.add(pendingRequests);
    }

    public void moveElevatorCar(ElevatorController elevatorController) {}
}
