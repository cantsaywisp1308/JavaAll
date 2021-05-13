package Demo;

import java.util.List;
import java.util.Scanner;

import Entities.BookStore;
import Model.BookStoreModel;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BookStoreModel bookStoreModel = new BookStoreModel();
		System.out.println("Câu 4: ");
		System.out.println("Enter your id: ");
		String id = scanner.next();
		List<BookStore> books = bookStoreModel.find(id);
		if (books.size()>0 ) {
			System.out.println("Yes! ");
		} else {
			System.out.println("No! ");
		}
	}

}
