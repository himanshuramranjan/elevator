package service;

import model.ElevatorCar;
import model.ElevatorRequest;

public class ElevatorController {

    private final int id;
    private final ElevatorCar elevatorCar;

    public ElevatorController(int id) {
        this.id = id;
        this.elevatorCar = new ElevatorCar(id);
    }

    public void acceptRequest(ElevatorRequest elevatorRequest) {
        ElevatorSystem.getInstance().getElevatorControllerStrategy().addRequest(elevatorRequest);
        controlCar();
    }

    private void controlCar() {
        ElevatorSystem.getInstance().getElevatorControllerStrategy().moveElevatorCar(this);
    }

    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }

    public int getId() {
        return id;
    }
}
