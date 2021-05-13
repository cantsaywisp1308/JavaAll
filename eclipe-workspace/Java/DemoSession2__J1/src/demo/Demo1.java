package demo;

public class Demo1 {

	public static void main(String[] args) {

		int[] a = new int[5];
		a[0] = 5;
		a[1] = -3;
		a[2] = 10;
		a[3] = 20;
		a[4] = -6;
		System.out.println(a[1]);
		System.out.println("len: " + a.length);
		System.out.println("List 1");
		for (int i = 0; i < a.length; i++) {
			System.out.print("   " + a[i]);
		}
		System.out.println("\nList 2");
		for (int i : a) {
			System.out.print("   " + i);
		}

	}

}
