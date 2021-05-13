package Demo1;

public class Demo6 {
	public static boolean isNumber(String s) {
		try {
			Double.parseDouble(s);
			return true; 
		}catch(Exception e) {
			return false; 
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1a";
		System.out.println(isNumber(s)); 
	}

}
