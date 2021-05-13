package demo5;

import entities.Student;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student(8.9);
		Student student5 = new Student("st05");
		Student student6 = new Student("st06", "Kid", 6.5);
		student6.print();
		Student student7 = new Student("st07", "Nyx", 6.5);
		student7.print();
		Student student8 = new Student("st08", "Koe", 6.5);
	}

}
