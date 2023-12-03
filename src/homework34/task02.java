package homework34;
import java.util.Scanner;public class task02 {
    /*Классификация планет

    Создать перечисление "Планеты солнечной системы",
    перечислить в нем все планеты.

    Для перечисления указать поле название планеты, конструктор,
    в который можно передать название.

    В классе Main сделать метод, который выведет тип планеты:
    Безжизненный камень, обитаемая планета, газовый гигант
    или ледяная планета.
    В методе main предложить пользователю выбрать планету
    и в ответ вывести классификацию этой планеты,
    используя разработанный ранее метод.
    Обратите внимание: плутон не считается планетой,
    так как находится в поясе Кой пера,
    где были найдены планетоиды больших размеров*/
    public enum Planet {
        МЕРКУРИЙ("Меркурий", "Безжизненный камень"),
        ВЕНЕРА("Венера", "Безжизненный камень"),
        ЗЕМЛЯ("Земля", "Обитаемая планета"),
        МАРС("Марс", "Безжизненный камень"),
        ЮПИТЕР("Юпитер", "Газовый гигант"),
        САТУРН("Сатурн", "Газовый гигант"),
        УРАН("Уран", "Газовый гигант"),
        НЕПТУН("Нептун", "Газовый гигант");

        private String planetName;
        private String planetInfo;

        Planet(String planetName, String planetInfo) {
            this.planetName = planetName;
            this.planetInfo = planetInfo;
        }

        public String getPlanetName() {
            return planetName;
        }

        public String getPlanetInfo() {
            return planetInfo;
        }
    }

    public static void main(String[] args) {
        System.out.println("Напишите номер планеты:");
        System.out.println("1. Меркурий");
        System.out.println("2. Венера");
        System.out.println("3. Земля");
        System.out.println("4. Марс");
        System.out.println("5. Юпитер");
        System.out.println("6. Сатурн");
        System.out.println("7. Уран");
        System.out.println("8. Нептун");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Planet planet;
        switch (i) {
            case 1:
                planet = Planet.МЕРКУРИЙ;
                break;
            case 2:
                planet = Planet.ВЕНЕРА;
                break;
            case 3:
                planet = Planet.ЗЕМЛЯ;
                break;
            case 4:
                planet = Planet.МАРС;
                break;
            case 5:
                planet = Planet.ЮПИТЕР;
                break;
            case 6:
                planet = Planet.САТУРН;
                break;
            case 7:
                planet = Planet.УРАН;
                break;
            case 8:
                planet = Planet.НЕПТУН;
                break;
            default:
                System.out.println("Некорректный выбор");
                return;
        }
        System.out.println("Вы выбрали планету " + planet.getPlanetName());
        System.out.println("Класс: " + getPlanetType(planet));
    }

    public static String getPlanetType(Planet planet) {
        String planetType;
        switch (planet) {
            case МЕРКУРИЙ:
            case ВЕНЕРА:
            case МАРС:
                planetType = "Безжизненный камень";
                break;
            case ЗЕМЛЯ:
                planetType = "Обитаемая планета";
                break;
            case ЮПИТЕР:
            case САТУРН:
            case УРАН:
            case НЕПТУН:
                planetType = "Газовый гигант";
                break;
            default:
                planetType = "Неизвестный тип";
                break;
        }
        return planetType;
    }
}
