package model;

public class ExternalButtonDispatcher {

    private ExternalButtonDispatcher() {}
    private static final ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();

    public static void submitRequest(int floor, Direction direction) {
        int elevatorId = elevatorSystem.getElevatorSelectionStrategy().selectElevator(floor, direction);

        for(ElevatorController elevatorController : elevatorSystem.getElevatorControllers()) {
            if(elevatorController.getElevatorCar().getId() == elevatorId) {
                elevatorController.acceptRequest(floor, direction);
            }
        }
    }
}
