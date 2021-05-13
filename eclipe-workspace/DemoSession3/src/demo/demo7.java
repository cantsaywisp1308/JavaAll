package demo;

public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "123";
		//Wrapper Class là kiểu java hỗ trợ để hỗ trợ kiểu dữ liệu gốc
		int age = 20; // Integer 
		long ag2 = 12; //Long 
		double price = 4.6; //Double 
		boolean status = true; //Boolean 
		
		int a = Integer.parseInt(s1);
		System.out.println("a: " + a );
		
		long b = Long.parseLong(s1);
		System.out.println ("b: " + b);
		
		String s2 = "4.5";
		double c = Double.parseDouble(s2);
		System.out.println("c: " + c);
		
		String s3 = "true";
		boolean d = Boolean.parseBoolean(s3);
		System.out.println("d: " + d);
		
		double dtb = 7.8;
		String s4 = String.valueOf(dtb);
		System.out.println("s4: " + s4);
	}

}
