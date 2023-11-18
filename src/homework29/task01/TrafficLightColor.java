package homework29.task01;

public enum TrafficLightColor {
    RED("красный"),
    YELLOW("желтый"),
    GREEN("зеленый");
    private String name; // название цвета
    TrafficLightColor(String name) {
        this.name = name; // устанавливаем название цвета
    }public String getName() {
        return name; // возвращаем название цвета
    }
}