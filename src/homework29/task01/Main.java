package homework29.task01;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(TrafficLightColor.RED);
        System.out.println("Текущий цвет светофора: " + trafficLight.getCurrentColor().getName());
        boolean canCross = trafficLight.canCrossTheRoad();
        String answer = trafficLight.getAnswer(canCross);
        System.out.println("Можно ли переходить дорогу? " + answer);

        trafficLight.setCurrentColor(TrafficLightColor.YELLOW);
        System.out.println("Текущий цвет светофора: " + trafficLight.getCurrentColor().getName());
        canCross = trafficLight.canCrossTheRoad();
        answer = trafficLight.getAnswer(canCross);
        System.out.println("Можно ли переходить дорогу? " + answer + " готовься к старту");

        trafficLight.setCurrentColor(TrafficLightColor.GREEN);
        System.out.println("Текущий цвет светофора: " + trafficLight.getCurrentColor().getName());
        canCross = trafficLight.canCrossTheRoad();
        answer = trafficLight.getAnswer(canCross);
        System.out.println("Можно ли переходить дорогу? " + answer);
    }
}