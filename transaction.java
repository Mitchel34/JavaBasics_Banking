package JavaBasics_Banking;

/*
Interface: An interface is a blueprint for a class. 
Interfaces define a set of methods that a class must
implement if it wants to be considered a type of 
that interface.
*/

public interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}