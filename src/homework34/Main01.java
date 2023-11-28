package homework34;

import java.util.Scanner;
public class Main01 {
    /*Пользователь вводит название месяца маленькими буквами.
    Вывести сезон, в котором будет этот месяц.
    Для этого сделать метод с оператором switch, который
    принимает и возвращает String
    Пример:
    Ввод:
    декабрь
    Вывод:
    зима*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите название месяца:");
        String monat = scanner.nextLine();
        String jahreszeit = jarSezon(monat);
        System.out.println("Это: " + jahreszeit);
    }
    public static String jarSezon(String monat) {
        String jahreszeit;
        switch (monat) {
            case "декабрь":
            case "январь":
            case "февраль":
                jahreszeit = "зима";
                break;
            case "март":
            case "апрель":
            case "май":
                jahreszeit = "весна";
                break;
            case "июнь":
            case "июль":
            case "август":
                jahreszeit = "лето";
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                jahreszeit = "осень";
                break;
            default:
                jahreszeit = "неизвестный месяц";
                break;
        }
        return jahreszeit;
    }
}