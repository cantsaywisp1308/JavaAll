package demo;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		a[0] = 5;
		a[1] = 4;
		a[2] = -3;
		a[3] = 0;
		a[4] = -1;
		System.out.println(a[1]);
		System.out.println("len: " + a.length);
		System.out.println("List 1: ");
		for(int i=0; i <a.length; i++) {
			System.out.print(" " + a[i]);
		}
		
		System.out.println("\nList 2: ");
		for(int i :a) {
			System.out.print(" " + i);
		}
	}

}
