package demo;

public class demo7 {
	
	public static int tongSoAm(int[] a) {
		int tong = 0; 
		for (int i : a) {
			if (i < 0) {
				tong += i;
			}
		}
		return tong; 
	}
	
	public static int demSoDuong(int[] a) {
		int count = 0;
		for (int i : a) {
			if(i > 0) {
				count++; 
			}
		}
		return count; 
	}
	
	public static int timMax(int[] a) {
		int max;
		max = a[0];
		for(int i : a) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max; 
	}
	
	public static int timMin(int[] a) {
		int min = a[0];
		for(int i : a) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min; 
	}
	
	public static double tinhTrungBinh(int[] a) {
		int n = a.length;
		int tong = tinhTong(a);
		double ave = tong / n;
		return ave; 
	}
	
	public static int tinhTong(int[] a) {
		int tong = 0;
		for (int i : a) {
			tong += i; 
		}
		return tong; 
	}
	
	public static int[] lietKeSoDuong(int[] a) {
		int [] b = {}; 
		int k = 0; 
		for (int i : a) {
			if (i > 0) {
				b[k] = i;
				k++; 
			}
		}
		return b; 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {0,1,2,3,-4,5,-6,-7,-8,9};
		int [] c = lietKeSoDuong(a);
		System.out.println(c);

	}

}
