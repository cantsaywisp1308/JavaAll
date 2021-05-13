package Entities;

public class Duck extends Animal{

		public Duck() {
		}
		
		public Duck(String name) {
			super(name);
		}
		
		@Override
		public void sound() {
			// TODO Auto-generated method stub
			System.out.println("Con vit "+ super.getName()+ " squark");
		}
		
		

}
