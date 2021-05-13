package entities;

public class ChauLuc {

	private String tencl;
	private int soqg;
	private QuocGia[] quocGias;

	public String getTencl() {
		return tencl;
	}

	public void setTencl(String tencl) {
		this.tencl = tencl;
	}

	public int getSoqg() {
		return soqg;
	}

	public void setSoqg(int soqg) {
		this.soqg = soqg;
	}

	public QuocGia[] getQuocGias() {
		return quocGias;
	}

	public void setQuocGias(QuocGia[] quocGias) {
		this.quocGias = quocGias;
	}

}
