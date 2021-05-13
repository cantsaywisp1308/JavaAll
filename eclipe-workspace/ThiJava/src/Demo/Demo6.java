package Demo;

import java.util.Scanner;

import Model.BookStoreModel;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BookStoreModel bookStoreModel = new BookStoreModel();
		double total = bookStoreModel.sum1(2020);
		System.out.println("Tổng cộng: "+ total);
	}
	
	public short getInt() {
		int s =5;
		return s;
	}

}
