import enums.Direction;
import service.ElevatorController;
import service.ElevatorSystem;
import model.Floor;
import strategy.elevatorcontrol.FirstComeFirstServeStrategy;
import strategy.elevatorselection.OddEvenStrategy;

public class ElevatorSystemApp {
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
        for(Floor floor: elevatorSystem.getFloors())
        {
            if(floor.getFloorId()==3)
                floor.pressButton(Direction.UP);
        }

        //Request 2
        for(Floor floor: elevatorSystem.getFloors())
        {
            if(floor.getFloorId()==5)
                floor.pressButton(Direction.UP);
        }

        //Request 3
        for(ElevatorController elevatorController: elevatorSystem.getElevatorControllers())
        {
            if(elevatorController.getElevatorCar().getId()==3)
                elevatorController.getElevatorCar().pressButton(10);

        }

//        Request 4
        for(ElevatorController elevatorController: elevatorSystem.getElevatorControllers())
        {
            if(elevatorController.getElevatorCar().getId()==2)
                elevatorController.getElevatorCar().pressButton(6);
        }

        //Request 5
        for(Floor floor: elevatorSystem.getFloors())
        {
            if(floor.getFloorId()==7)
                floor.pressButton(Direction.DOWN);
        }

        //Request 6
        for(ElevatorController elevatorController: elevatorSystem.getElevatorControllers())
        {
            if(elevatorController.getElevatorCar().getId()==3)
                elevatorController.getElevatorCar().pressButton(1);
        }
    }
}