package HW_4;

public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Пополнено на %.2f. Текущий баланс: %.2f\n", amount, balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Снято %.2f. Текущий баланс: %.2f\n", amount, balance);
        } else {
            System.out.println("Недостаточно средств на счете.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500);
    }
}