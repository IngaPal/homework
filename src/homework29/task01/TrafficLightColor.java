package homework29.task01;

public enum TrafficLightColor {
    RED("красный"),
    YELLOW("желтый"),
    GREEN("зеленый");

    private String name;
    TrafficLightColor(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}