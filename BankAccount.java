
class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    // Constructor
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Display account details
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    // Deposit amount
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    // Withdraw amount
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(101, "Anish", 5000);

        acc.display();

        acc.deposit(2000);
        acc.withdraw(3000);

        System.out.println("\nUpdated Account Details:");
        acc.display();
    }
}
