package homework29.task01;

public class TrafficLight {
    private TrafficLightColor currentColor;

    public TrafficLight(TrafficLightColor currentColor) {
        this.currentColor = currentColor;
    }

    public TrafficLightColor getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(TrafficLightColor currentColor) {
        this.currentColor = currentColor;
    }

    public boolean canCrossTheRoad() {
        return currentColor == TrafficLightColor.GREEN;
    }

    public String getAnswer(boolean canCross) {
        return canCross ? "да" : "нет";
    }
}
