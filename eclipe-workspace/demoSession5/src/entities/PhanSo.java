package entities;

public class PhanSo {
	private int tuSo;
	private int mauSo;
	
	public int getTuSo() {
		return tuSo;
	}
	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}
	public int getMauSo() {
		return mauSo;
	}
	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}
	
	public void print() {
		System.out.println(tuSo + "/" + mauSo);
	}
	
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	
	public PhanSo Tong(PhanSo ps1) {
		
		int ms1 = ps1.mauSo * this.mauSo;
		int ts1 = (ps1.tuSo*this.mauSo)+(this.tuSo*ps1.mauSo);
		PhanSo tongps = new PhanSo(ts1,ms1);
		return tongps;
		
	}
}
