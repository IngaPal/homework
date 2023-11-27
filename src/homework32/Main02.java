package homework32;

import java.util.Scanner;

/* Написать программу, которая выведет табличку
    умножения числа, которое введет пользователь.
    Напечатать полностью примеры.
    Пример:
    Ввод:
    4*/
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите значение: ");
        int number = scanner.nextInt();
        for (int i = 1; i <=10 ; i++) {
            int res = number * i;
            System.out.println(number + " * " + i + " = " + res);
        }
    }
}