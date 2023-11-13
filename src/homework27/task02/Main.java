package homework27.task02;

public class Main {
    public static void main(String[] args) {
        // номер счета
        BankAccount bankAccount = new BankAccount("1234509876");
        // для получения и использования номера счета.
        String accountNumber = bankAccount.getAccountNumber();
        bankAccount.deposit(1000); // зачисляем сумму на счет
        bankAccount.withdraw(500); // Снимаем сумму
        // Выводим текущий баланс с помощью метода getBalance()
        System.out.println("Aktueller Kontostand: " + bankAccount.getBalance());
    }
}