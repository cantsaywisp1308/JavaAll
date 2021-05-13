package Demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.Account;
import Model.ProductModelAccount;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date start = simpleDateFormat.parse("01/01/1990");
			Date end = simpleDateFormat.parse("31/12/1999");
			ProductModelAccount  productModelAccount = new ProductModelAccount();
			//List<Account> accounts = productModelAccount.search("Axe");
			//accounts = productModelAccount.search(1);
			List<Account> accounts = productModelAccount.search(start, end); 
			System.out.println("size: "+ accounts.size());
			for(Account account:accounts) {
				System.out.println(account.toString()); 
				System.out.println("==========================");
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
