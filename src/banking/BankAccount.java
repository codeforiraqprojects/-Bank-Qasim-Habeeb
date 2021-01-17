package banking;

import java.util.Scanner;

public class BankAccount extends AbstractMethods {
	Scanner scanner2 = new Scanner(System.in);
	int acc_no;
	String name;
	float amount;
	float balance = 10000000f;

	void deposit() {
		System.out.print("How much to deposite: ");
		amount = scanner2.nextFloat();
		balance += amount;
		System.out.println("New balance is:" + balance);
	}

	void withdraw() {
		do {
			System.out.print("How much to withdraw: ");
			amount = scanner2.nextFloat();
			if (balance < amount)
				System.out.println("not enough money, please try again.");
		} while (balance < amount);
		balance -= amount;
		System.out.println("New balance is: " + balance);
	}

	void checkBalance() {
		System.out.println("Account Number: " + acc_no);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
	}
}
