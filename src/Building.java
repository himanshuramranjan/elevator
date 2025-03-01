import java.util.List;

public class Building {
    List<Floor> floors;

    public Building(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Floor> getFloors() {
        return floors;
    }
}
