package demo5;

import entities.Rectangle;

public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle();
		rec1.input();
		rec1.output();
		System.out.println("The peripheral of the rectangle: " + rec1.peripheral());
		System.out.println("The area of the rectangle: " + rec1.area());
	}

}
