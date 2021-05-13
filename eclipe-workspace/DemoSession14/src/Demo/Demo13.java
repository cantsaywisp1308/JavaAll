package Demo;

import java.util.Date;

import org.mindrot.jbcrypt.BCrypt;

import Entities.Account;
import Model.ProductModelAccount;

public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductModelAccount productModelAccount = new ProductModelAccount();
		String password = "123";
		Account account1 = new Account();
		account1.setUsername("acc1");
		account1.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));
		account1.setFullname("Account1");
		account1.setBirthday(new Date());
		account1.setStatus(true);
		System.out.println(productModelAccount.create(account1));
		
		Account account2  = new Account();
		account2.setUsername("acc2");
		account2.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));
		account2.setFullname("Account2");
		account2.setBirthday(new Date());
		account2.setStatus(false);
		System.out.println(productModelAccount.create(account2));
	}

}
