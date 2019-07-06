package com.parallel.project;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int accountId;
		String accountPassword;
		int amount;
		ProjectModules pm = new ProjectModules();
		while(true) {
			System.out.println("*************Welcome*************");
			System.out.println("Enter 1 for create account\nEnter 2 for Show Balance\nEnter 3 for Deposit");
			System.out.println("Enter 4 for withdraw\nEnter 5 for fund transfer\nEnter 6 for print Transaction");
			System.out.println("Enter 7 for exit");
			int ui = sc.nextInt();
			switch(ui) {
			 	case 1:
			 		 System.out.println("Enter account ID");
			 		 accountId = sc.nextInt();
			 		 sc.nextLine();
			 		 System.out.println("Enter account password");
			 		 accountPassword = sc.nextLine();
			 		 pm.userAccountCreate(accountId, accountPassword);
			 		 break;
			 	 case 2:
			 		 System.out.println("Enter account ID");
			 		 accountId = sc.nextInt();
			 		 sc.nextLine();
			 		 System.out.println("Enter account password");
			 		 accountPassword = sc.nextLine();
			 		 pm.getUserAccountDetails(accountId, accountPassword);
			 		 break;
			 	 case 3:
			 		 System.out.println("Enter account ID");
			 		 accountId = sc.nextInt();
			 		 sc.nextLine();
			 		 System.out.println("Enter account password");
			 		 accountPassword = sc.nextLine();
			 		 System.out.println("Enter amount you want to deposit");
			 		 amount = sc.nextInt();
			 		 sc.nextLine();
			 		 pm.Deposit(accountId, accountPassword, amount);
			 		 break;
			 	 case 4:
			 		 System.out.println("Enter account ID");
			 		 accountId = sc.nextInt();
			 		 sc.nextLine();
			 		 System.out.println("Enter account password");
			 		 accountPassword = sc.nextLine();
			 		 System.out.println("Enter amount you want to withdraw");
			 		 amount = sc.nextInt();
			 		 pm.withDraw(accountId, accountPassword, amount);
			 		 break;
			 	 case 5:
			 		 System.out.println("Enter account ID");
			 		 accountId = sc.nextInt();
			 		 sc.nextLine();
			 		 System.out.println("Enter account password");
			 		 accountPassword = sc.nextLine();
			 		 System.out.println("Enter amount you want to Transfer");
			 		 amount = sc.nextInt();
			 		 System.out.println("Enter account ID user that you want to transfer amount");
			 		 int accountId2 = sc.nextInt();
			 		 pm.fundTransfer(accountId, accountPassword, accountId2, amount);
			 		 break;
			 	 case 6:
			 		System.out.println("Enter account ID");
			 		 accountId = sc.nextInt();
			 		 sc.nextLine();
			 		 System.out.println("Enter account password");
			 		 accountPassword = sc.nextLine();
			 		 pm.printTransactions(accountId, accountPassword);
			 		 break;
			 	 case 7:
			 		 System.exit(1);
			}
		}
	}

}
