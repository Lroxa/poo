public class BankAccount {
   int accountNumber;
   int balance;
   String holder;

    public BankAccount(int accountNumber, int balance, String holder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holder = holder;
    }
    public void depositing () {
        System.out.println("You are depositing money in the account number: " + accountNumber);
    }
    public void withdraw () {
        System.out.println(" You are withdrawing " + balance);
    }

}
