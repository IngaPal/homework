package homework29.task01;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(TrafficLightColor.RED); // светофор с красным цветом
        System.out.println("Текущий цвет светофора: " + trafficLight.getCurrentColor().getName()); // выводим цвет
        //можно ли переходить дорогу? и получаем ответ на вопрос
        // используем условный оператор ? "да" : "нет" с выбором значения
        String answer = trafficLight.getCurrentColor() == TrafficLightColor.GREEN ? "да" : "нет";
        System.out.println("Можно ли переходить дорогу? " + answer);  // выводим ответ
        trafficLight.setCurrentColor(TrafficLightColor.YELLOW); // меняем на желтый цвет
        System.out.println("Текущий цвет светофора: " + trafficLight.getCurrentColor().getName());
        answer = trafficLight.getCurrentColor() == TrafficLightColor.GREEN ? "да" : "нет";
        System.out.println("Можно ли переходить дорогу? " + answer + ", готовься к старту");
        trafficLight.setCurrentColor(TrafficLightColor.GREEN); // меняем на зелёный цвет
        System.out.println("Текущий цвет светофора: " + trafficLight.getCurrentColor().getName());
        answer = trafficLight.getCurrentColor() == TrafficLightColor.GREEN ? "да" : "нет";
        System.out.println("Можно ли переходить дорогу? " + answer);
    }
}