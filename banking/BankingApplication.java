package banking;

import java.util.*;

public class BankingApplication {

	public static void main (String args[]) {
		BankAccount obj1 = new BankAccount("John","J22");
		BankAccount obj2 = new BankAccount("Louis", "L23");
		BankAccount obj3 = new BankAccount("Kelly","K12");
		
		Scanner T = new Scanner(System.in);
		System.out.println("Do you have an existing account? ");
		String reply = T.next();
		Scanner ans = new Scanner(System.in);
		String name;
		String customerID;
		String customerName;

		if (reply.equals("no") || reply.equals("No"))
		{
			System.out.println("Enter customer name: ");
			customerName = ans.next();
			System.out.println("Enter customer ID");
			customerID =ans.next();
			BankAccount obj4 = new BankAccount(customerName, customerID);
			obj4.showMenu();
		}
		if (reply.equals("Yes") || reply.equals("yes"))
		{
			System.out.println("Enter Customer ID: ");
			name = ans.next();
			if (name.equals("J23")) {
				obj1.showMenu();
			}
			if (name.equals("L23")) {
				obj2.showMenu();
			}
			if (name.equals("K12")) {
				obj3.showMenu();
			}
		}
		
	
}
