package demo5;

import entities.Student;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.input();
		student1.print();
		student1.rank();
		System.out.println(student1.rank1());
		
		Student student2 = new Student();
		student2.input();
		student2.print();
		student2.rank();
		System.out.println(student2.rank1());
		
	}

}
