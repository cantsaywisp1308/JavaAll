package entities;

import java.util.Scanner;

public class QuocGia {

	private String tenqg;
	private int soTp;
	private ThanhPho[] thanhPhos;

	public String getTenqg() {
		return tenqg;
	}

	public void setTenqg(String tenqg) {
		this.tenqg = tenqg;
	}

	public int getSoTp() {
		return soTp;
	}

	public void setSoTp(int soTp) {
		this.soTp = soTp;
	}

	public ThanhPho[] getThanhPhos() {
		return thanhPhos;
	}

	public void setThanhPhos(ThanhPho[] thanhPhos) {
		this.thanhPhos = thanhPhos;
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so thanh pho: ");
		this.soTp = scanner.nextInt();
		this.thanhPhos = new ThanhPho[this.soTp];
		for (int i = 0; i < this.soTp; i++) {
			this.thanhPhos[i] = new ThanhPho();
			this.thanhPhos[i].nhap();
		}
	}

}
