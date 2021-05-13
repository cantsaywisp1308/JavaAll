package demo;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {
				"Name ", "Name 2" , "Name 3" , "Name 4"
		};
		System.out.println("len: " + names.length);
		for(int i = 0; i < names.length ; i++ ) {
			System.out.println(names[i]);
		}
		
		System.out.println("List 2: ");
		for (String i : names) {
			System.out.println(" " + i );
		}
	}

}
