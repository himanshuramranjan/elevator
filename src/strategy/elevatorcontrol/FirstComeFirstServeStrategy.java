package strategy.elevatorcontrol;

import model.ElevatorController;

public class FirstComeFirstServeStrategy extends ElevatorControllerStrategy {

    @Override
    public void moveElevatorCar(ElevatorController elevatorController) {
        //poll each requests out of queue one by one
        //move elevator according to each request
        //Disadvantage: frequent change of direction of elevator, hence inefficient and
        // long waiting time for users
    }
}
