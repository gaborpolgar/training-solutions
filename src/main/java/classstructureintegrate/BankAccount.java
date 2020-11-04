package classstructureintegrate;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    void transfer(BankAccount anotherAccount, int amount){
        withdraw(amount);
        anotherAccount.deposit(amount);
    }

    public String getInfo(){
        return getOwner() + " (" + getAccountNumber() + "):" + getBalance() + "Ft";
    }
}
