package demo;

public class demo4 {
	
	public static void hello() {
		System.out.println("Hello World");
	}
	
	public static void hi(String name) {
		System.out.println("Hi "+ name);
	}
	
	public static void add(int a, int b) {
		int result = a + b;
		System.out.println("Kết quả là: " + result);
	}
	
	public static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	
	public static void add(double a, double b) {
		double result = a + b;
		System.out.println("Kết quả là: " + result);
	}
	
	public static void add(int a, double b) {
		double result = a + b;
		System.out.println("Kết quả là: " + result);
	}
	
	public static void add(int a, int b, int c) {
		int result = a + b +c;
		System.out.println("Kết quả là: " + result);
	}
	
	public static int multiple(int a, int b) {
		return a * b;
	}
	
	public static int[] sortDesc(int[] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				int temp;
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp; 
				}
			}
		}
		return a; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello();
		hello();
		hi("ABC");
		hi("DEF");
		add(3,4);
		add(4.2,6.5);
		add(1,2,4);
		int[] b = {1,2,3,-4,-5,-6};
		printArray(b);
		sortDesc(b);
	}

}
