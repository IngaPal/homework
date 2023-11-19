package homework30;

public class Main01 {
    public static void main(String[] args) {
        int intVariable = 15;
        System.out.println("Целый: " + intVariable + ", " + "4 байта");
        // можно написать и так:
        // System.out.println("Целый: " + intVariable + ", " + Integer.BYTES + " байта");
        double floatVariable = 6.12;
        System.out.println("Нецелый: " + floatVariable + ", " + "8 байт");
        // или:
        // System.out.println("Нецелый: " + floatVariable + ", " + Double.BYTES + " байт");
        char charVariable = 'A';
        System.out.println("Символьный: " + charVariable + ", " + "1 байт");
        // или:
        // System.out.println("Символьный: " + charVariable + ", " + Character.BYTES + " байт");
        boolean booleanVariable = true;
        System.out.println("Логический: " + booleanVariable + ", " + "1 байт");
        // или:
        // System.out.println("Логический: " + booleanVariable + ", " + Byte.BYTES + " байт");
    }
}