package model;

import java.util.List;

public class Building {
    private List<Floor> floors;

    public Building(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void addFloors(Floor newFloor) {
        this.floors.add(newFloor);
    }
}
