package banking;

import java.util.Scanner;
import java.time.*;

public class BankAccount {

	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid)
	{
		customerName= cname;
		customerId=cid;
				
	}
	void deposit (int amount) {
		if (amount>0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
		
	}
	
	void withdraw (int amount) {
		if (amount>0 && amount<balance)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
		if (amount>0 && amount>balance) {
			System.out.println("Not enough money in the account!");
		}
	}
	
	void getPreviousTransaction() 
	{
		if (previousTransaction >0) {
			System.out.println("Deposit of $"+previousTransaction);
		}
		else if (previousTransaction<0) {
			System.out.println("Withdrawl of $"+Math.abs(previousTransaction));
		}
		else {
			System.out.println("No previous Transaction");
		}
	}
	void showMenu()
	{
		char option='\0';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome "+customerName);
		System.out.println("Your ID is "+customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		//option for interest
		//add date-time for previous transaction
		
		
		do {
			System.out.println("************************************************************");
			System.out.println("Please select one of the previous above actions");
			System.out.println("************************************************************");
			option = scan.next().charAt(0);
			System.out.println("\n");
			
			switch(option) 
				{
					case 'A':
						System.out.println("----------------------------------");
						System.out.println("Balance = "+balance);
						System.out.println("----------------------------------");
						System.out.println("\n");
						break;
						
					case 'B':
						System.out.println("----------------------------------");
						System.out.println("Enter an amount to deposit: ");
						System.out.println("----------------------------------");
						int amount = scan.nextInt();
						deposit(amount);
						System.out.println("\n");
						break;
						
					case 'C':
						System.out.println("----------------------------------");
						System.out.println("Enter an amount to withdraw: ");
						System.out.println("----------------------------------");
						int amount2 = scan.nextInt();
						withdraw(amount2);
						
					case 'D':
						System.out.println("----------------------------------");
						getPreviousTransaction();
						System.out.println("----------------------------------");
						System.out.println("\n");
						break;
						
					case 'E':
						System.out.println("----------------------------------");
						break;
					default:
						System.out.println("Invalid option!! Please enter again");
						break;
				}
		}while (option!='E');
		
		System.out.println("Thank you for using our services!");
	}
}
