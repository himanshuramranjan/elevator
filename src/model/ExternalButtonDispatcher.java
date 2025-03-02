package model;

import strategy.elevatorselection.ElevatorSelectionStrategy;

public class ExternalButtonDispatcher extends ButtonDispatcher {

    public static volatile ExternalButtonDispatcher externalButtonDispatcher;
    private final ElevatorSystem elevatorSystem;
    private ExternalButtonDispatcher() {
        this.elevatorSystem = ElevatorSystem.getInstance();
    }

    public static ExternalButtonDispatcher getInstance() {
        if(externalButtonDispatcher == null) {
            synchronized (ExternalButtonDispatcher.class) {
                if(externalButtonDispatcher == null) {
                    externalButtonDispatcher = new ExternalButtonDispatcher();
                }
            }
        }
        return externalButtonDispatcher;
    }
    @Override
    public void submitRequest(int floor, Direction direction) {
        int elevatorId = elevatorSystem.getElevatorSelectionStrategy().selectElevator(floor, direction);

        for(ElevatorController elevatorController : elevatorSystem.getElevatorControllers()) {
            if(elevatorController.getElevatorCar().getId() == elevatorId) {
                elevatorController.acceptRequest(floor, direction);
            }
        }
    }
}
