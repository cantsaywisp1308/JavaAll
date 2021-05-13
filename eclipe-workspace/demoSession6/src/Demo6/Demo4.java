package Demo6;

import entities.Mobile;

public class Demo4 {
	
	public static void print(Mobile[] mobiles) {
		for(Mobile mobile : mobiles) {
			mobile.output();
			System.out.println("_______________________"); 
		}
	}
	
	public static double totalPrice(Mobile[] mobiles) {
		double total = 0;
		for (Mobile mobile: mobiles) {
			total += mobile.getPrice(); 
		}
		return total; 
	}
	
	public static String ktMa(Mobile[] mobiles, String key) {
		boolean result = false;
		for(Mobile mobile: mobiles) {
			if (mobile.getId().toLowerCase().equalsIgnoreCase(key.toLowerCase())) {
				result = true;
				break; 
			}
		}
		if (result) {
			return "Có!";
		} else {return "Không";}
	}
	
	public static Mobile[] timKiem(Mobile[] mobiles,String key) {
		Mobile[] ketqua = new Mobile[3];
		Mobile kqTam = new Mobile();
		int i = 0; 
		for(Mobile mobile: mobiles) {
			if(mobile.getName().toLowerCase().contains(key.toLowerCase())) {
				kqTam = mobile;
				ketqua[i] = kqTam;
				i++;
			}
		}
		return ketqua; 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile[] mobiles = {
				new Mobile("id01","iPhone 11", 400 , 3 ,"iPhone"),
				new Mobile("id02","Samsung S8", 600 , 13 ,"Samsung"),
				new Mobile("id03","Google Nexus 4", 450 , 23 ,"Google"),
				new Mobile("id04","Samsung S10", 500 , 11 ,"Samsung")
		}; 
		System.out.println("Tổng đơn giá: "+totalPrice(mobiles));
		System.out.println(ktMa(mobiles,"id10"));
		Mobile[] kq = timKiem(mobiles,"iphone");
		print(kq);
		
		
	}

}
