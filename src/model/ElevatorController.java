package model;

import strategy.PendingRequest;

public class ElevatorController {

    private final int id;
    private final ElevatorCar elevatorCar;

    public ElevatorController(int id) {
        this.id = id;
        this.elevatorCar = new ElevatorCar(id);
    }

    public void acceptRequest(int floor, Direction direction) {
        ElevatorSystem.getInstance().getElevatorControllerStrategy().addRequest(new PendingRequest(floor, direction));
        controlCar();
    }

    private void controlCar() {
        ElevatorSystem.getInstance().getElevatorControllerStrategy().moveElevatorCar(this);
        System.out.println("Elevator moving...");
    }

    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }
}
