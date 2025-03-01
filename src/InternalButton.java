import java.util.ArrayList;
import java.util.List;

public class InternalButton extends Button{
    ButtonDispatcher internalButtonDispatcher;
    List<Floor> floors;

    public InternalButton() {
        this.internalButtonDispatcher = new InternalButtonDispatcher();
        floors = new ArrayList<>();
    }

    public void pressButton(int floor, Direction direction, int elevatorId) {

    }
}
