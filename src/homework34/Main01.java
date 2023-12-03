package homework34;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
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
        System.out.println("Enter the name of the month:");
        String monat = scanner.nextLine();
        String season = getSeason(monat);
        System.out.println("It is: " + season);
    }

    public static String getSeason(String monat) {
        String season;
        switch (monat) {
            case "december":
            case "january":
            case "february":
                season = "winter";
                break;
            case "march":
            case "april":
            case "may":
                season = "spring";
                break;
            case "june":
            case "july":
            case "august":
                season = "summer";
                break;
            case "september":
            case "october":
            case "november":
                season = "autumn";
                break;
            default:
                season = "unknown month";
                break;
        }
        return season;
    }
}