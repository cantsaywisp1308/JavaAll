package demo;

public class demo5 {
	
	public static boolean ktnt(int n) {
		int count = 0;

		for (int i = 1; i<n; i++) {
			if (n % i ==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		} else return false;
	}
	
	public static int total(int[] a) {
		int total = 0; 
		for(int i: a) {
			total += i;
		}
		return total; 
	}
	
	public static int timmin(int[] a) {
		int min = a[0];
		for (int i : a) {
			if (i < min) {
				min = i;
			}
		}
		return min; 
	}
	
	public static int timmax(int[] a) {
		int max = a[0];
		for (int i : a) {
			if (i >  max) {
				max = i;
			}
		}
		return max; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,4,5,6,7,8,9};
		//System.out.print("1. Tim tổng mảng ");
		//System.out.print("2. Tim min max ");
		//System.out.print("3. Tim cac so nguyên tố trong  ");
		for (int i: a) {
			if (ktnt(i)==true) {
				System.out.println(i + " ");
			}
		}
		
		int tong = total(a);
		System.out.println("Tổng của mảng là: " + tong);
		
		int min;
		min = timmin(a);
		System.out.println("Min của mảng là: " + min);
		
		int max;
		max = timmax(a);
		System.out.println("Max của mảng là: " + max);
	}

}
