package homework29.task01;

public class TrafficLight {
    private TrafficLightColor currentColor; //  цвет светофора
    public TrafficLight(TrafficLightColor currentColor) {
        this.currentColor = currentColor; // Светофор
    }
    public TrafficLightColor getCurrentColor() {
        return currentColor; // возвращаем цвет светофора
    }
    public void setCurrentColor(TrafficLightColor currentColor) {
        this.currentColor = currentColor; // устанавливаем цвет светофора
    }
}