public class ElevatorController {

    private final int id;
    private final ElevatorCar elevatorCar;

    public ElevatorController(int id) {
        this.id = id;
        this.elevatorCar = new ElevatorCar(id);
    }

    public void acceptRequest(int floor, Direction direction) {
        //
        controlCar();
    }

    private void controlCar() {
//
        System.out.println("Elevator moving...");
    }
}
