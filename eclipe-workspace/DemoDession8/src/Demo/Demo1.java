package Demo;

import Entities.Animal;
import Entities.Cat;
import Entities.Chicken;
import Entities.Duck;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal12 = new Chicken("Noi");
		animal12.sound();
		
		Animal animal13 = new Duck("Xiem");
		animal13.sound();
		
		Animal animal14 = new Cat("Muop");
		animal14.sound();
	}

}
