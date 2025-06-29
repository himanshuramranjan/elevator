package model.buttondispatcher;

import model.ElevatorRequest;

public interface ButtonDispatcher {
    void submitRequest(ElevatorRequest elevatorRequest);
}
