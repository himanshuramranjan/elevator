package model;

public enum Direction {
    UP("UP"),
    DOWN("DOWN"),
    NONE("NONE");

    private final String value;

    public String getValue() {
        return this.value;
    }

    Direction(String value) {
        this.value = value;
    }
}
