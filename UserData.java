package com.parallel.project;

import java.util.ArrayList;
import java.util.Iterator;

public class UserData {
	private String AccountPassword;
	private int Balance = 0;
	ArrayList<String> Transaction = new ArrayList<String>();
	public String getAccountPassword() {
		return AccountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		AccountPassword = accountPassword;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
//	public String[] getTransaction() {
//		return Transaction;
//	}
	public String getTransaction() {
		String s = "";
		Iterator i = Transaction.iterator();
		while(i.hasNext()) {
			s = s+ "\n"+ (String) i.next();
		}
		return s;
	}
	public void setTransaction(String transaction) {
		Transaction.add(transaction);
	}
	
	
	
	
}
