package Demo;

import Entities.NhanVien;
import Entities.NhanVienSanXuat;
import Entities.NhanVienVanPhong;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien[] employees = {
			new NhanVienVanPhong("of01", "John", "New York", 2.2),
			new NhanVienSanXuat("pr01", "Jill", "New York", 1.2),
			new NhanVienVanPhong("of02", "Monica", "Washington DC", 2.5),
			new NhanVienSanXuat("pr02", "Jackson", "Denver",1.2),
			new NhanVienSanXuat("pr03", "Sven", "Denver", 1.3),
			new NhanVienSanXuat("pr04","Vester","New York", 1.3),
			new NhanVienVanPhong("of03","Linda","Chicago",2.4)
		};
		
		for(NhanVien employee:employees) {
			employee.input();
			employee.output(); 
			
		}
	}

}
