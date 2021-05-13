package entities;

public class NhanVienSanXuat extends NhanVien implements INhanVien {

	private int sosp;

	public int getSosp() {
		return sosp;
	}

	public void setSosp(int sosp) {
		this.sosp = sosp;
	}

	@Override
	public void tinhLuong() {
		System.out.println("Tinh Luong");
	}

	@Override
	public void tinhPhuCap() {
		System.out.println("Tinh Phu Cap");
	}

	
	
	
	
}
