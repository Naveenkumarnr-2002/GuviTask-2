package oops;

import java.util.Scanner;

// Class account Creation
public class Account {

    double balance;

//    Constructors with argument

    public Account(double balance){
        this.balance=balance;
    }

//    Constructors without argument

    public Account(){
    }

//    method to deposit amount
    public void depositAmount(){
        Scanner se=new Scanner(System.in);
        System.out.println("Enter Deposit Amount: ");

        double deposit = se.nextDouble();
        balance=balance+deposit;
        System.out.println("The Deposited Amount: "+deposit);
        System.out.println("The Balance Amount: "+balance);

    }

//    method to withdraw amount

    public void withdrawAmount(){
        Scanner se=new Scanner(System.in);
        System.out.println("Enter withdraw Amount: ");
        double withdraw=se.nextDouble();
        balance=balance-withdraw;
        System.out.println("the withdraw Amount: "+withdraw);
        System.out.println("the balance Amount: "+balance);
    }

//    method to display amount
    public void displayAmount(){
        System.out.println("The Account balance: "+balance);
    }

    public static void main(String[]args){
       Account account= new Account(1000);

       account.displayAmount();
       account.depositAmount();
       account.withdrawAmount();
       account.displayAmount();
    }
}
