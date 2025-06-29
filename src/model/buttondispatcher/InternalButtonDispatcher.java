package model;

public class InternalButtonDispatcher implements ButtonDispatcher {
    private static final ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();

    @Override
    public void submitRequest(ElevatorRequest elevatorRequest) {
        for(ElevatorController elevatorController : elevatorSystem.getElevatorControllers()) {
            if(elevatorController.getElevatorCar().getId() == elevatorRequest.getElevatorId()) {
                elevatorController.acceptRequest(elevatorRequest.getFloor(), elevatorRequest.getDirection());
            }
        }
    }
}
