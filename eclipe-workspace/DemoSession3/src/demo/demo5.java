package demo;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "binh";
		String s2 = "tuan";
		int result = s1.compareTo(s2);
		if (result < 0 ) {
			System.out.print("s1 < s2");
		} else if (result == 0) {
			System.out.println("s1 = s2");
		} else {
			System.out.println("s1 > s2");
		}
	}

}
