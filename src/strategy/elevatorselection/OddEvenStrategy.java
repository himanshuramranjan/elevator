package strategy.elevatorselection;

import model.Direction;

public class OddEvenStrategy extends ElevatorSelectionStrategy{

    @Override
    public int selectElevator(int floor, Direction direction) {
        return 0;
    }
}
