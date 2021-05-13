package demo;

public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "p01,name,2,4.5";
		String[] result = s.split(",");
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		
		String[]  lines = {
				"p01,Laptop 1,4.5,8",
				"p02,Laptop 2,6.5,9",
				"p03,watch 3,0.7,12",
				"p04,Radio 4, 5,10"
		};
		//Xây dựng các hàm sau:
		// 1. Tính tổng số lượng các sản phẩm
		// 2. Tính tổng tiền tất cả sp
		// 3. Đếm có bao nhiêu sản phẩm có cùng từ khoá
		// 4. Kiêm tra mã sp có tồn tại hay không
		
		System.out.println("Tổng số lượng: " + question1(lines));
		System.out.println("Tổng tiền : " + question2(lines));
		System.out.println("Đếm : " + question3(lines,"Laptop"));
		if(question4(lines,"p01")) {
			System.out.println("Yes!");
		} else {
			System.out.println("Nope!"); 
		}
		
		
	}
	public static int question1(String[] lines) {
		int total = 0;
		for (String line :lines) {
			String [] result = line.trim().split(",");
			total += Integer.parseInt(result[3]);
		}
		return total; 
	}
	
	public static double question2(String[] lines) {
		double total = 0;
		for (String line :lines) {
			String [] result = line.trim().split(",");
			total += Integer.parseInt(result[3]) + Double.parseDouble(result[2]) ;
		}
		return total; 
	}
	
	public static int question3(String[] lines, String key) {
		int  count = 0;
		for (String line :lines) {
			String [] result = line.trim().split(",");
			if(result[1].trim().toLowerCase().contains(key.trim().toLowerCase())) {
				count++; 
			}
		}
		return count; 
	}
	
	public static boolean question4(String[] lines, String key) {
		boolean flag = false;
		for (String line: lines) {
			String [] result = line.trim().split(",");
			if(result[0].trim().toLowerCase().equalsIgnoreCase(key.trim().toLowerCase())  ) {
				flag = true;
				break; 
			}
		}
		return flag; 
	}

}
