package model;

public class InternalButtonDispatcher {
    private InternalButtonDispatcher() {}

    private static final ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();

    public static void submitRequest(int floor, Direction direction, int elevatorId) {
        for(ElevatorController elevatorController : elevatorSystem.getElevatorControllers()) {
            if(elevatorController.getElevatorCar().getId() == elevatorId) {
                elevatorController.acceptRequest(floor, direction);
            }
        }
    }
}
