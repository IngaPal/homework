package homework31;

import java.util.Scanner;
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите число c: ");
        double c = scanner.nextDouble();
        System.out.print("Введите число d: ");
        double d = scanner.nextDouble();
        double outcome = (a * b) + (c * a) + c / d * c;
        System.out.println("Результат: " + outcome);
    }
}