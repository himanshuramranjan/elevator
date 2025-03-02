import model.Direction;
import model.ElevatorController;
import model.ElevatorSystem;
import model.Floor;
import strategy.elevatorcontrol.FirstComeFirstServeStrategy;
import strategy.elevatorselection.OddEvenStrategy;

public class Main {
    public static void main(String[] args) {

        //ElevatorSystem is singleton class
        ElevatorSystem elevatorSystem= ElevatorSystem.getInstance();
        elevatorSystem.setElevatorSelectionStrategy(new OddEvenStrategy());
        elevatorSystem.setElevatorControllerStrategy(new FirstComeFirstServeStrategy());

        //add Floors
        int totalFloors= 50;
        for(int i=0; i<=totalFloors; i++)
        {
            elevatorSystem.addFloor(new Floor(i));
        }
        System.out.println("No. of floors added " + totalFloors);

        //add elevators
        int totalElevators = 4;
        for(int i=1; i<=totalElevators; i++)
        {
            elevatorSystem.addElevators(new ElevatorController(i));
        }
        System.out.println("No. of elevators added " + totalElevators);

        //Working

        //Request 1
        System.out.println("Person at floor 1 presses UP Button");
        for(Floor floor: elevatorSystem.getFloors())
        {
            if(floor.getFloorId()==1)
                floor.pressButton(Direction.UP);
        }

        //Request 2
        System.out.println("Person at floor 5 presses UP Button");
        for(Floor floor: elevatorSystem.getFloors())
        {
            if(floor.getFloorId()==5)
                floor.pressButton(Direction.UP);
        }

        //Request 3
        System.out.println("Person presses 10 in elevator 2");
        for(ElevatorController elevatorController: elevatorSystem.getElevatorControllers())
        {
            if(elevatorController.getElevatorCar().getId()==2)
                elevatorController.getElevatorCar().pressButton(10);

        }

        //Request 4
        System.out.println("Person presses 6 in elevator 2");
        for(ElevatorController elevatorController: elevatorSystem.getElevatorControllers())
        {
            if(elevatorController.getElevatorCar().getId()==2)
                elevatorController.getElevatorCar().pressButton(6);
        }

        //Request 5
        System.out.println("Person at floor 7 presses DOWN Button");
        for(Floor floor: elevatorSystem.getFloors())
        {
            if(floor.getFloorId()==7)
                floor.pressButton(Direction.DOWN);
        }

        //Request 6
        System.out.println("Person presses 1 in elevator 3");
        for(ElevatorController elevatorController: elevatorSystem.getElevatorControllers())
        {
            if(elevatorController.getElevatorCar().getId()==3)
                elevatorController.getElevatorCar().pressButton(1);
        }
    }
}