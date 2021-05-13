package Models;

import java.util.ArrayList;
import java.util.List;

import Entities.Account;

public class AccountModel {
	private List<Account> accounts = new ArrayList<Account>();
	
	public AccountModel() {
		accounts.add(new Account("acc1","1234","admin"));
		accounts.add(new Account("acc2","123456","admin"));
		accounts.add(new Account("acc3","1234567","employee"));
	}
	
	public Account login(String username, String password) {
		for(Account account:accounts) {
			if (account.getUsername().equalsIgnoreCase(username) && (account.getPassword().equalsIgnoreCase(password)) ) {
				return account; 
			}
		}
		return null;  
	}

}
