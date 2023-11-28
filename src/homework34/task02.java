package homework34;
import java.util.Scanner;
public class task02 {
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
        String planetName;
        String planetInfo;
        switch (i) {
            case 1:
                planetName = "Меркурий";
                planetInfo = "Безжизненный камень";
                break;
            case 2:
                planetName = "Венера";
                planetInfo = "Безжизненный камень";
                break;
            case 3:
                planetName = "Земля";
                planetInfo = "Обитаемая планета";
                break;
            case 4:
                planetName = "Марс";
                planetInfo = "Безжизненный камень";
                break;
            case 5:
                planetName = "Юпитер";
                planetInfo = "Газовый гигант";
                break;
            case 6:
                planetName = "Сатурн";
                planetInfo = "Газовый гигант";
                break;
            case 7:
                planetName = "Уран";
                planetInfo = "Газовый гигант";
                break;
            case 8:
                planetName = "Нептун";
                planetInfo = "Газовый гигант";
                break;
            default:
                System.out.println("Некорректный выбор");
                return;
        }
        System.out.println("Вы выбрали планету " + planetName);
        System.out.println("Класс: " + planetInfo);
    }
}