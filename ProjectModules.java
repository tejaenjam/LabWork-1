package com.parallel.project;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;



public class ProjectModules {
	//private int accountId;
	
	HashMap<Integer,UserData> UserAccountData = new HashMap<Integer,UserData>();
	
	public void userAccountCreate(int accountId,String accountPassword) {
		UserData userInfo = new UserData();
		userInfo.setAccountPassword(accountPassword);
		UserAccountData.put(accountId, userInfo);
		userInfo.setTransaction("Account Created");
		
	}
	
	
	public void showBalance(int accountId,String accountPassword) {
		Set s = UserAccountData.entrySet();
		Iterator i = s.iterator();
		boolean flag = true;
		int userBalance = 0;
		while(i.hasNext()) {
			Entry e = (Entry) i.next();
			if(e.getKey().equals(accountId)) {
				UserData userInfo = (UserData)e.getValue();
				if(userInfo.getAccountPassword().equals(accountPassword)) {
					userBalance = userInfo.getBalance();
					userInfo.setTransaction("User checked balance");
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("wrong credentials");
		}
		else {
			System.out.println(accountId+" Balance is "+userBalance);
		}
	}
	
	public void Deposit(int accountId,String accountPassword,int amount) {
		Set s = UserAccountData.entrySet();
		Iterator i = s.iterator();
		boolean flag = true;
		int userBalance = 0;
		while(i.hasNext()) {
			Entry e = (Entry) i.next();
			if(e.getKey().equals(accountId)) {
				UserData userInfo = (UserData)e.getValue();
				if(userInfo.getAccountPassword().equals(accountPassword)) {
					flag = false;
					userBalance = userInfo.getBalance();
					userBalance = userBalance + amount;
					userInfo.setBalance(userBalance);
					UserAccountData.put(accountId, userInfo);
					userInfo.setTransaction("User Deposit amount "+amount);
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("wrong credentials");
		}
		else {
			System.out.println("After Deposit Balance is "+userBalance);
		}
	}
	
	public void withDraw(int accountId,String accountPassword,int amount) {
		Set s = UserAccountData.entrySet();
		Iterator i = s.iterator();
		boolean flag = true;
		int userBalance = 0;
		while(i.hasNext()) {
			Entry e = (Entry) i.next();
			if(e.getKey().equals(accountId)) {
				UserData userInfo = (UserData)e.getValue();
				if(userInfo.getAccountPassword().equals(accountPassword)) {
					
					userBalance = userInfo.getBalance();
					userBalance = userBalance - amount;
					userInfo.setBalance(userBalance);
					UserAccountData.put(accountId, userInfo);
					userInfo.setTransaction("User withdraw amount "+amount);
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("wrong credentials");
		}
		else {
			System.out.println("After withdraw Balance is "+userBalance);
		}
	}
	
	public void fundTransfer(int sourceAccountId,String accountPassword,int destinationAccountId,int amount) {
		Set s = UserAccountData.entrySet();
		Iterator i = s.iterator();
		Iterator i2 = s.iterator();
		boolean flag = true;
		while(i.hasNext()) {
			Entry e = (Entry) i.next();
			if(e.getKey().equals(sourceAccountId)) {
				UserData sourceUserInfo = (UserData)e.getValue();
				if(sourceUserInfo.getAccountPassword().equals(accountPassword)) {
					while(i2.hasNext()) {
						Entry e2 = (Entry) i2.next();
						if(e2.getKey().equals(destinationAccountId)) {
							UserData destinationUserInfo = (UserData)e2.getValue();
							int sourceUserBalance = sourceUserInfo.getBalance();
							int destinationUserBalance = destinationUserInfo.getBalance();
							sourceUserBalance = sourceUserBalance - amount;
							destinationUserBalance = destinationUserBalance + amount;
							sourceUserInfo.setBalance(sourceUserBalance);
							destinationUserInfo.setBalance(destinationUserBalance);
							UserAccountData.put(sourceAccountId, sourceUserInfo);
							UserAccountData.put(destinationAccountId, destinationUserInfo);
							sourceUserInfo.setTransaction("User transfer amount "+amount);
							destinationUserInfo.setTransaction("User Receive amount "+amount);
							flag = false;
							break;
						}
					}
				}
			}
		}
		if(flag) {
			System.out.println("Wrong credentials");
		}
		else {
			System.out.println("successfull");
		}
	}
	
	public void getUserAccountDetails(int accountId,String accountPassword) {
		Set s = UserAccountData.entrySet();
		Iterator i = s.iterator();
		String password = "";
		int balance = 0;
		boolean flag = true;
		while(i.hasNext()) {
			Entry e = (Entry) i.next();
			if(e.getKey().equals(accountId)) {
				UserData userInfo = (UserData)e.getValue();
				if(userInfo.getAccountPassword().equals(accountPassword)) {
					password = userInfo.getAccountPassword();
					balance = userInfo.getBalance();
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("wrong credentials");
		}
		else {
			System.out.println("Account id = "+accountId+"password = "+password+"\nBalance = "+balance);
		}
		
	}
	
	public void printTransactions(int accountId,String accountPassword) {
		Set s = UserAccountData.entrySet();
		Iterator i = s.iterator();
		String password = "";
		String Transaction = "";
		int balance = 0;
		boolean flag = true;
		while(i.hasNext()) {
			Entry e = (Entry) i.next();
			if(e.getKey().equals(accountId)) {
				UserData userInfo = (UserData)e.getValue();
				if(userInfo.getAccountPassword().equals(accountPassword)) {
					password = userInfo.getAccountPassword();
					balance = userInfo.getBalance();
					Transaction = userInfo.getTransaction();
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("wrong credentials");
		}
		else {
			System.out.println(Transaction);
		}
	}
	
	
	

}
