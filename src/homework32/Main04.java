package homework32;

import java.util.Scanner;
/*Запросить у пользователя размер массива, потом сам массив целых чисел.
        Проверить, является ли массив отсортированным по возрастанию.
        Пример 1:
        Ввод:
        5
        1 6 7 89 123
        Вывод:
        Массив отсортирован
        Пример 2:
        Ввод:
        6
        1 5 3 7 88 4
        Вывод:
        Массив не отсортирован*/
public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("Массив не отсортирован");
                return;
            }
        }
        System.out.println("Массив отсортирован");
    }
}