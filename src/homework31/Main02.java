package homework31;

import java.util.Scanner;
import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько костей будите бросать?");
        int nummer = scanner.nextInt();
        if (nummer == 1 || nummer == 2) {
            Random random = new Random();
            System.out.println("Результат:");
            int dice1 = random.nextInt(6) + 1;
            System.out.println(dice1);
            if (nummer == 2) {
                int dice2 = random.nextInt(6) + 1;
                System.out.println(dice2);
            }
        } else {
            System.out.println("У меня нет такого количества костей.");
        }
    }
}