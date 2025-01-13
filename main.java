package JavaBasics_Banking;
//a package is a way to organize related classes and interfaces into a namespace
public class Main {
    public static void main(String[] args) {

        //Create a member who will have a bank account

        Member JohnDoe = new Member(
            "John Doe",    // Name
            28,            // Age
            "123 Main St", // Address
            "123-45-6789", // SSN
            "Staff Sergeant"     // Military rank
        );

        //Member creation using overloaded constructor:
        Member JaneDoe = new Member("Jane Doe", 28);

        //Polymorphism: Storing a CheckingAccount in a BankAccountreference
        BankAccount JohnDoeChecking = new CheckingAccount(JohnDoe, 500.0);
        // We can also store it in a transcation reference
        Transaction transactionRef = JohnDoeChecking;
    
        //Operations
        JohnDoeChecking.showAccountDetails();
        transactionRef.deposit(200.0);
        transactionRef.withdraw(100.0);

        //2nd overloaded constructor for CheckingAccount
        BankAccount JaneDoeChecking = new CheckingAccount(JaneDoe);
        JaneDoeChecking.showAccountDetails();
        JaneDoeChecking.deposit(1000.0);
    
    }
}