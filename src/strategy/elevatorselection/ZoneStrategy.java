package strategy.elevatorselection;

import model.Direction;
import model.ElevatorController;
import model.ElevatorSystem;

import java.util.concurrent.ThreadLocalRandom;

public class ZoneStrategy extends ElevatorSelectionStrategy{

    @Override
    public int selectElevator(int floor, Direction direction) {
        for(ElevatorController eController: ElevatorSystem.getInstance().getElevatorControllers())
        {
            //assign elevators according to zones in building
            //out of these elevators select the elevator which is going in the same direction or is idle
        }
        return ThreadLocalRandom.current().nextInt(1, ElevatorSystem.getInstance().getElevatorControllers().size());
    }
}
