package homework33;
public class Main02 {
    /*Разработать метод, возвращающий массив типа char,
    в котором записан английский алфавит (маленькими буквами)
    Подсказка: ASCII

    Дополнительное задание: Сделать то же самое, но возвращать тип String*/
    public static void main(String[] args) {
        char[] letters = englAlphabet ();

        // Выводим результат
        System.out.print("Английский алфавит (маленькими буквами): ");
        for (char letter : letters) {
            System.out.print(letter);
        }
    }
    public static char[]englAlphabet () {
        char[] letters = new char[26];
        for (int i = 0; i < 26; i++) {
            letters[i] = (char)('a' + i);
        }
        return letters;
    }
}