package model;

import enums.Direction;

public class ElevatorRequest {
    private final Integer floor;
    private final Direction direction;
    private Integer elevatorId;

    public ElevatorRequest(int floor, Direction direction, Integer elevatorId) {
        this.floor = floor;
        this.direction = direction;
        this.elevatorId = elevatorId;
    }

    public int getFloor() { return floor; }
    public Direction getDirection() {
        return direction;
    }
    public Integer getElevatorId() {
        return elevatorId;
    }
    public void setElevatorId(Integer elevatorId) { this.elevatorId = elevatorId; }
}
