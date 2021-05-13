package demo;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		s1 = s1.toUpperCase(); 
		System.out.println("s1: " + s1);
		String s2 = "DEF";
		s2 = s2.toLowerCase(); 
		System.out.println("s2: "+ s2);
		String s3 = "        fgh      ";
		System.out.println("len s3: "+ s3.length());
		s3 = s3.trim();
		System.out.println("len2 s3: "+ s3.length());
		String s4 = ""; 
		boolean result = s4.isEmpty(); 
		System.out.print("Is empty " + result);
	}

}
