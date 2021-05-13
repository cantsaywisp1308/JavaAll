package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entities.Account;
import Model.ProductModelAccount;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Account account = new Account();
			Scanner scanner = new Scanner(System.in); 
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.println("Enter your username here: ");
			String username = scanner.next();
			account.setUsername(username);
			System.out.println("Enter your password here: ");
			String password = scanner.next();
			account.setPassword(password);
			System.out.println("Enter your full name here: ");
			String fullname = scanner.next();
			account.setFullname(fullname);
			System.out.println("Enter your birthday here(dd/mm/yyyy): ");
			String birthdayString = scanner.next();
			Date birthday = simpleDateFormat.parse(birthdayString);
			account.setBirthday(birthday);
			System.out.println("Enter the status here (True or False): ");
			String statusString  = scanner.next();
			Boolean status = Boolean.parseBoolean(statusString);
			account.setStatus(status);
			
			ProductModelAccount productModelAccount = new ProductModelAccount();
			System.out.println(productModelAccount.create(account)); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
	}

}
