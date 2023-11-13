package homework27.task01;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Настя", 36);
        human1.introduce();

        Human human2 = new Human("Вадим", 19);
        human2.introduce();

        Human human3 = new Human("Мария", 28);
        human3.introduce();

        human1.setName("Анна");
        human1.setAge(40);
        human1.introduce();
    }
}