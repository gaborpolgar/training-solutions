package classstructureintegrate;

public class Bank {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("00014621-48314399", "Polgár Gábor", 100);
        System.out.println(bankAccount.getInfo());
        bankAccount.deposit(50);
        System.out.println(bankAccount.getInfo());
        bankAccount.withdraw(100);
        System.out.println(bankAccount.getInfo());
        BankAccount anotherAccount = new BankAccount("00245673-56783111", "Takács Orsolya", 100);
        System.out.println(anotherAccount.getInfo());
        bankAccount.transfer(anotherAccount, 50);
        System.out.println(bankAccount.getInfo());
        System.out.println(anotherAccount.getInfo());

    }
}
