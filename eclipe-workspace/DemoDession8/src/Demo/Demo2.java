package Demo;

import Entities.Animal;
import Entities.Cat;
import Entities.Chicken;
import Entities.Duck;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = new Animal[6];
		animals[0] = new Chicken("Chicken 1");
		animals[1] = new Duck("Duck 1");
		animals[2] = new Cat("Cat 1");
		animals[3] = new Duck("Duck 2");
		animals[4] = new Cat("Cat 2");
		animals[5] = new Chicken("Chicken 2");
		
		for(Animal animal : animals) {
			animal.sound(); 
		}
	}

}
