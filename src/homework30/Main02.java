package homework30;

public class Main02 {
    public static void main(String[] args) {
        double a = 2.23;
        double b = 1.0;
        double c = 1.0;
        double d = 1.0;
        // 2.23 * (1.0 - 1.0) + 1.0 * 2.23 / 1.0
        // (1.0 - 1.0) = 0.0
        // 2.23 * 0.0 = 0.0
        // 1.0 * 2.23 = 2.23
        // 2.23 / 1.0 = 2.23
        // 0.0 + 2.23 = 2.23
        double outcome = a * (b - d) + c * a / d;
        System.out.println("Результат: " + outcome);
    }
}