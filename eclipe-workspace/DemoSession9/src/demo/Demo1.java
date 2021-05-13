package demo;

import entities.Human;
import entities.IB;
import entities.IC;
import entities.IHuman;

public class Demo1 {

	public static void main(String[] args) {
		
		IHuman human = new Human();
		human.eat();
		human.sleep();
		
		IB ib = new Human();
		ib.b1();
		ib.b2();
		
		IC ic = new Human();
		ic.c1();
		ic.d2();

	}

}
