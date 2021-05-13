package Demo;

import java.util.Scanner;

import Model.ProductModelAccount;

public class Demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your username here: ");
		String username = scanner.next();
		System.out.println("Enter your password here: ");
		String password = scanner.next();
		ProductModelAccount productModelAccount = new ProductModelAccount();
		if(productModelAccount.login(username, password) != null ) {
			System.out.println("Valid" );
		} else {
			System.out.println("Invalid"); 
		}
	}

}
