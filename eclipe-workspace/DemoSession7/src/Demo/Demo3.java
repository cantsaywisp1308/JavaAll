package Demo;

import Entities.HinhTron;
import Entities.HinhVuong;
import Entities.Hinhhoc;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hinhhoc hinh1 = new Hinhhoc();
		hinh1.input();
		if (hinh1.getHinh().toLowerCase().contains("vuong")) {
			HinhVuong hv1 = new HinhVuong();
			hv1.input();
			double dt = hv1.DienTich(hinh1.getDoRongDuongBien(),hv1.getA());
			double cv = hv1.ChuVi(hinh1.getDoRongDuongBien(), hv1.getA());
			hv1.output(cv, dt);
		} else {
			HinhTron ht1 = new HinhTron();
			ht1.input();
			double dt = ht1.DienTich(ht1.getR(), hinh1.getDoRongDuongBien());
			double cv = ht1.ChuVi(ht1.getR(), hinh1.getDoRongDuongBien());
			ht1.output(cv,dt);
		}
		System.out.println("Độ rộng đường biên: "+hinh1.getDoRongDuongBien());
		
	}

}
