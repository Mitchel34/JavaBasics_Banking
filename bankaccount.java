package JavaBasics_Banking;

/*
 Abstraction: 'BankAccount' is an abstract class that 
 cannot be instatiated on its own. It partially implements
 the Transactoin interface but leaves specific details to concrete
 subclasses

 Inheritance: Anu specific account type eg. CheckingAccount wil extend this class.
 */

 public abstract class BankAccount implements Transaction {
    
    private static int nextAccountNumber = 1000;
    private int accountNumber;
    private double balance;
    private Member owner; //Each account belongs to a member

    //Constructor for BankAccount
    public BankAccount(Member owner, double initialDeposit) {
        this.owner = owner;
        this.balance = initialDeposit;
        this.accountNumber = nextAccountNumber++;
    }

    //Common behaviors
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Member getOwner() {
        return this.owner;
    }

    /* 
    Overriding: occurs when a subclass implements a method 
    which is already defined in the superclass or Base Class. 
    */

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited $" + amount + " into Account Number #" + accountNumber
            + ". New Balance: $" + this.balance);
    }

    @Override
    public void withdraw(double amount){
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + " from Account Number #" + accountNumber
                + ". New balance: $" + this.balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of $ " + amount + " in Account Number #" + accountNumber);
        }
    }

    //Abstract methods: concrete subclasses must implement this method to show specific account details
    public abstract void showAccountDetails();
 }