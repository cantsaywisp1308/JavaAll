package Demo;

import org.mindrot.jbcrypt.BCrypt;

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "123";
		String hash = BCrypt.hashpw(password, BCrypt.gensalt()); 
		System.out.println(hash); 
		String inputPassword = "1234"; 
		boolean result = BCrypt.checkpw(inputPassword, hash);
		System.out.println(result); 
	}

}
