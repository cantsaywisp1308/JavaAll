package Demo;

import java.util.List;
import java.util.Scanner;
import java.nio.file.*;
import Entities.BookStore;
import Model.BookStoreModel;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BookStoreModel bookStoreModel = new BookStoreModel();
		System.out.println("Câu 1: ");
		List<BookStore> bookStores1 = bookStoreModel.find();
		for(BookStore bookStore:bookStores1) {
			System.out.println(bookStore.toString()); 
			System.out.println("==========================");
		
		}	
	}

}
