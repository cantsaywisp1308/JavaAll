package Model;

import java.nio.file.Files;
import java.nio.file.Paths;

import Entities.Account;

public class AccountModel {
	public boolean save(Account account, String fileName) {
		try {
			String result = "Username: " + account.getUsername();
			result += "\n Password: " + account.getPassword();
			result += "\n Fullname: " + account.getFullname();
			result += "\n Description: " + account.getDescription();
			if(account.getRoles().size() > 0) {
				result += "\n Roles: ";
				for(String role: account.getRoles()) {
					result += "\n" + role;
				}
			}
			Files.write(Paths.get(fileName), result.getBytes());
			return true; 
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
}
