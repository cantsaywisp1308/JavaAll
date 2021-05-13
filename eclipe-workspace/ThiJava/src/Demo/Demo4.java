package Demo;

import java.util.List;
import java.util.Scanner;

import Entities.BookStore;
import Model.BookStoreModel;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BookStoreModel bookStoreModel = new BookStoreModel();
		System.out.println("Câu 3: ");
		System.out.println("Enter your key: ");
		String key = scanner.next();
		List<BookStore> books = bookStoreModel.find(key,10,400);
		for(BookStore book:books) {
			System.out.println(book.toString());
			System.out.println("==========================");
		}
		
	}

}
