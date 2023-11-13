package homework27.task02;

public class BankAccount {
    private double balance; // сумма денег на счете
    private final String accountNumber;
     // номер счета
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    // Метод -получения номера счета
    public String getAccountNumber() {
        return accountNumber; // Возвращаем значение
    }
    // Метод - сумма денег на счету
    public double getBalance() {
        return balance; // Возвращаем значение
    }
    // Метод - зачисления денег на счет
    public void deposit(double amount) {
        if (amount > 0) { // Проверяем, что зачисленая сумма больше нуля
            balance += amount;   // Увеличиваем
            // Выводим сообщение что успешно зачислена сумма на счет
            System.out.println("Betrag " + amount + " erfolgreich eingeschrieben.");
        } else {
            // Выводим сообщение об ошибке
            System.out.println("negative beträge können nicht abgegrenzte.");
        }
    }
    // Метод - снятия денег со счета
    public void withdraw(double amount) {
        if (amount > balance) {  // Проверяем сумму
            // Выводим сообщение об ошибке, если сумма превышает текущий баланс
            System.out.println("Unzureichende Kontodeckung.");
        } else {
            balance -= amount; // Уменьшаем
            // Выводим сообщение об успешном снятии суммы со счета
            System.out.println("Betrag " + amount + " erfolgreich abgebucht.");
        }
    }
}