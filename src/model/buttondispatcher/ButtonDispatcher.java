package model.buttondispatcher;

import model.ElevatorRequest;
import service.ElevatorSystem;

public interface ButtonDispatcher {
    ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();
    void submitRequest(ElevatorRequest elevatorRequest);
}
