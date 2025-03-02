import java.util.ArrayList;
import java.util.List;

public class InternalButton extends Button{
    private final ButtonDispatcher internalButtonDispatcher;
    private List<Integer> floors;

    public InternalButton() {
        this.internalButtonDispatcher = new InternalButtonDispatcher();
        floors = new ArrayList<>();
    }

    @Override
    public void pressButton(int floor, Direction direction, int elevatorId) {

        System.out.println("Pressed for floor : " + floor + " from elevator : " + elevatorId);
        floors.add(floor);
        internalButtonDispatcher.submitRequest(floor, direction, elevatorId);

    }
}
