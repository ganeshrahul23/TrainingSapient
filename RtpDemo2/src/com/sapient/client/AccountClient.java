package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.*;

public class AccountClient {
	private static Account[] arr = new Account[2];
	static{
		arr[0] = new SavingsAccount(1001, "Ramesh", 75000.09);
		arr[1] = new LoanAccount(1002, "Suresh", 42000.00);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opt = null;
		int accType = 0;
		double amount = 0;
		
		do{
			System.out.println("Enter Account Type 0 for Savings and 1 for Loan");
			accType = sc.nextInt();
			if(accType < 0 || accType >1){
				System.out.println("Invalid Acctype");
			}else{
				System.out.println("Enter the amount to deposit");
				amount = sc.nextDouble();
				arr[accType].deposit(amount);
				arr[accType].display();	
			}
		
			System.out.println("Press y to continue");
			opt = sc.next();
		}while(opt.equals("y"));
		sc.close();
		


	}

}
