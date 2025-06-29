package model.buttondispatcher;

import service.ElevatorController;
import model.ElevatorRequest;
import service.ElevatorSystem;

public class ExternalButtonDispatcher implements ButtonDispatcher {

    private static final ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();

    @Override
    public void submitRequest(ElevatorRequest elevatorRequest) {
        int elevatorId = elevatorSystem.getElevatorSelectionStrategy().selectElevator(elevatorRequest);

        for(ElevatorController elevatorController : elevatorSystem.getElevatorControllers()) {
            if(elevatorController.getElevatorCar().getId() == elevatorId) {
                elevatorRequest.setElevatorId(elevatorId); // set the elevatorId so that controller can move that car
                elevatorController.acceptRequest(elevatorRequest);
            }
        }
    }
}
