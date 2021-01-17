package banking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i;
		BankAccount account = new BankAccount();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your account number: ");
		account.acc_no = scanner.nextInt();
		System.out.print("Enter your name: ");
		account.name = scanner.next();
		System.out.println("Welcome " + account.name + " to the bank,");
		System.out.println("Please write number between 1 and 3: ");
		System.out.println("1- Check the balance.");
		System.out.println("2- Deposite.");
		System.out.println("3- Withdraw.");
		i = scanner.nextInt();
		switch (i) {
		case 1:
			account.checkBalance();
			break;
		case 2:
			account.deposit();
			break;
		case 3:
			account.withdraw();
			break;
		}
		scanner.close();
	}

}
