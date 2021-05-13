package demo;

public class Demo4 {

	public static void hello() {
		System.out.println("Hello World");
	}

	public static void hi(String name) {
		System.out.println("Hi " + name);
	}

	public static void add(int a, int b) {
		int result = a + b;
		System.out.println("result: " + result);
	}

	public static void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("result: " + result);
	}

	public static void add(double a, double b) {
		double result = a + b;
		System.out.println("result: " + result);
	}

	public static void add(int a, double b) {
		double result = a + b;
		System.out.println("result: " + result);
	}

	public static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + "   ");
		}
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static int[] sortDesc(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 5, 10, 4 };
		printArray(a);

		System.out.println();
		int[] b = { -4, 11, -9, 5, 22 };
		printArray(b);
		printArray(sortDesc(b));

		hello();
		hello();
		hi("ABC");
		hi("DEF");
		add(1, 2);
		add(5.6, 2.3);
		add(1, 2, 3);
	}

}
