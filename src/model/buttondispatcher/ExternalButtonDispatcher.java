package model;

public class ExternalButtonDispatcher implements ButtonDispatcher {

    private static final ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();

    @Override
    public void submitRequest(ElevatorRequest elevatorRequest) {
        int elevatorId = elevatorSystem.getElevatorSelectionStrategy().selectElevator(elevatorRequest.getFloor(), elevatorRequest.getDirection());

        for(ElevatorController elevatorController : elevatorSystem.getElevatorControllers()) {
            if(elevatorController.getElevatorCar().getId() == elevatorId) {
                elevatorController.acceptRequest(elevatorRequest.getFloor(), elevatorRequest.getDirection());
            }
        }
    }
}
