package Chapter_10;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account1 = new Account(11, 100, 4.5);
		Account[] accounts = new Account[10];
	
		for(int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();
			accounts[i].setID(i);
			accounts[i].setBalance(100);
			
		}
		int option = 0;
		
		while (true) {
			int id = askForID(accounts);
			//Account user = getAccount(accounts,id);
			option = 0;
			while (option != 4) {
			System.out.print(
                    "Main menu\n" +
                            "1: check balance\n" +
                            "2: withdraw\n" +
                            "3: deposit\n" +
                            "4: exit\n" +
                            "Enter a choice: ");
            option = input.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("The balance is $" + accounts[id].getBalance() + ".\n");
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    accounts[id].withdraw(input.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    accounts[id].Deposit(input.nextDouble());
                    break;
                case 4:
                    System.out.println("Logged out...");
                    System.out.println("");
                    
                    
                    break;
                    default:
                        System.out.println("Invalid input.. Enter a number 1-4");
            }
			}
            //id = askForID(accounts);
        }
    }
	 public static int askForID(Account[] accounts) {

	        Scanner input = new Scanner(System.in);
	        int id = 0;
	        boolean isValidID = false;
	        while (!isValidID) {
	            System.out.print("Enter an ID: ");
	            id = input.nextInt();
	            
	            if (!hasID(accounts, id)) {
	                System.out.println("INVALID ID: Try again.");
	            } else {
	                isValidID = true;
	            }
	        }
	        return id;
	    }
	 public static boolean hasID(Account[] accounts, int id) {
	        for (Account account : accounts) {
	            if (id == account.getId(id)) {
	                return true;
	            }
	        }
	        return false;
	    }
	
	public static Account getAccount(Account[] accounts, int id) {
	
	    for (Account account : accounts) {
	        if (id == account.getId(id)) {
	            return account;
	        }
	    }
	    return null;
	}
}
	class Account{
	protected double balance = 0.0;
	double annualinterestRate = 0.0;
	Date dateCreated;
	int id = 0;
	Account(){
		
	}

	
public void setID(int newId) {
	id = newId;
}
public void setBalance(double newBalance) {
	balance = newBalance;
}
public Account(int newId, double newBalance ){
	this();
	newId = id;
	newBalance = balance;
 } 
Account(int newId, double newBalance, double newAnnualinteristRate){
	 balance = newBalance;
	 id = newId;
	 annualinterestRate = newAnnualinteristRate;
	 dateCreated = new java.util.Date();
 }
Account(Date dateCreated){ 
	 dateCreated = new java.util.Date();
 }
 //gets the monthly interest rate by dividing the annual interest rate
 double getMonthlyInterestRate(double annualinterestRate) {
	 
	
	 return (annualinterestRate/12);
 }
 //gets the monthly interest amount
 double getMonthlyInterest(double annualinterestRate, double balance){ 
	 return ((balance*getMonthlyInterestRate(annualinterestRate))/100);
 }
 //return the new balance after withdrawal is made
double withdraw(double amount) {
	balance -= amount;
	 return balance;
 }
//adds to the balance
 double Deposit(double amount) {
	 balance += amount;
	 return balance;
 }
 public int getId(int id) {
	 int newId = id;
	 return newId;
 }
 public double getBalance() {
     double newBalance = balance;
	 return newBalance;
 }
 }

