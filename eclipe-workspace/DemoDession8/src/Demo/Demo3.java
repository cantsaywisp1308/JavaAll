package Demo;

import Entities.HinhChuNhat;
import Entities.HinhVuong;
import Entities.Hinhhoc;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hinhhoc[] hinhhocs ={
		new HinhVuong("Hinh vuong 1",4),
		new HinhChuNhat("HCN 1", 3,4), 
		new HinhVuong("Hinh vuong 2",5),
		new HinhChuNhat("HCN 2", 6,8)
		};
		for(Hinhhoc hinhhoc:hinhhocs) {
			System.out.println("Hinh: " + hinhhoc.getName());
			System.out.println("Chu vi: " + hinhhoc.ChuVi());
			System.out.println("Diện tích: "+hinhhoc.DienTich());
			System.out.println("================================="); 
			
		}
		
	}

}
