package JavaBasics_Banking;

/*
 * Inheritance: Checking accoutn extends the abstract BankAccount class
 * 
 * 
 * Polymorphism: An instance of Checking Account can be referenced as BankAccount or as Transaction
 */

 public class CheckingAccount extends BankAccount {
    
    //constructor which allows specifying an intial deposit.
    public CheckingAccount(Member owner, double intitialDeposit){
        super(owner, intitialDeposit);
    }

    //constuctor that assumes intial deposit is $0
    public CheckingAccount(Member owner) {
        super(owner, 0.0);
    }

    @Override
    public void showAccountDetails() {
        System.out.println("=== Checking Account Details ===");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: $" + getBalance());
        System.out.println("---------------------------------");
    }

}