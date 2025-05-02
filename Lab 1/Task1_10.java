/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahsan.lab_1;

/**
 *
 * @author ASUS
 */
class BankAccount {
    String accountNumber;
    double balance;

    
     BankAccount() {
        this.accountNumber = "Unknown";
        this.balance = 0.0;
    }

  
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

   
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: $" + balance);
        System.out.println();
    }
}

public class Task1_10 {
    public static void main(String[] args) {
       
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("A12345", 5000.00);
        account1.displayInfo();
        account2.displayInfo();
    }
}