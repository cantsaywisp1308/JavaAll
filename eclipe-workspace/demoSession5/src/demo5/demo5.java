package demo5;

import entities.PhanSo;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo phanso1 = new PhanSo(1,2);
		PhanSo phanso2 = new PhanSo(1,3);
		System.out.println("Total: = ");
		phanso1.Tong(phanso2).print();
	}

}
