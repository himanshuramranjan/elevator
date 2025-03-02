package model;

import strategy.elevatorcontrol.ElevatorControllerStrategy;
import strategy.elevatorselection.ElevatorSelectionStrategy;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {

    public static volatile ElevatorSystem elevatorSystem;
    private List<ElevatorController> elevatorControllers;
    private List<Floor> floors;
    private ElevatorSelectionStrategy elevatorSelectionStrategy;
    private ElevatorControllerStrategy elevatorControllerStrategy;

    private ElevatorSystem() {
        this.elevatorControllers = new ArrayList<>();
        this.floors = new ArrayList<>();
    }

    public static ElevatorSystem getInstance() {
        if(elevatorSystem == null) {
            synchronized (ElevatorSystem.class) {
                if(elevatorSystem == null) {
                    elevatorSystem = new ElevatorSystem();
                }
            }
        }
        return elevatorSystem;
    }

    public void addElevators(ElevatorController elevatorController) {
        this.elevatorControllers.add(elevatorController);
    }

    public void removeElevators(ElevatorController elevatorController) {
        this.elevatorControllers.remove(elevatorController);
    }

    public void addFloor(Floor floor) {
        this.floors.add(floor);
    }

    public void removeFloor(Floor floor) {
        this.floors.remove(floor);
    }

    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy elevatorSelectionStrategy) {
        this.elevatorSelectionStrategy = elevatorSelectionStrategy;
    }

    public void setElevatorControllerStrategy(ElevatorControllerStrategy elevatorControllerStrategy) {
        this.elevatorControllerStrategy = elevatorControllerStrategy;
    }

    public ElevatorSelectionStrategy getElevatorSelectionStrategy() {
        return elevatorSelectionStrategy;
    }

    public ElevatorControllerStrategy getElevatorControllerStrategy() {
        return elevatorControllerStrategy;
    }

    public List<ElevatorController> getElevatorControllers() {
        return elevatorControllers;
    }

    public List<Floor> getFloors() {
        return floors;
    }
}
