package Demo;

import java.util.List;
import java.util.Scanner;

import Entities.BookStore;
import Model.BookStoreModel;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BookStoreModel bookStoreModel = new BookStoreModel();
		System.out.println("Câu 2 : ");
		List<BookStore> bookStores2 = bookStoreModel.find(10, 2017, true);
		
		
		for(BookStore bookStore:bookStores2) {
			bookStoreModel.saveFile(bookStores2);
			System.out.println(bookStore.toString()); 
			System.out.println("==========================");
		
		}
	}

}
