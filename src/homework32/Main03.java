package homework32;

import java.util.Scanner;
/*Написать программу, которая запрашивает у пользователя число в диапазоне от 1 до 10 (включительно).
        Если пользователь написал неподходящее число, программа спрашивает еще раз.
        Таким образом, программа должна продолжать спрашивать, пока пользователь не введет подходящее число.
        Пример окончательного вывода одной программы:
        Введите число от 1 до 10.
        -8
        Введите число от 1 до 10.
        111
        Введите число от 1 до 10.
        0
        Введите число от 1 до 10.
        4
        Вы ввели 4. Спасибо!*/
public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите число от 1 до 10 ");
            number = scanner.nextInt();
            if (number >= 1 && number <= 10) {
                System.out.println("Вы ввели " + number + "." + " Спасибо!");
                break;
            } else {
                System.out.println("неподходящее число!");
            }
        }while (true);
    }
}