package Entities;

public class Cat extends Animal{
	
	public Cat() {
		super(); 
	}
	
	public Cat(String name) {
		super(name); 
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Con meo " + super.getName()+ " Meow meow ");
	}
	
}
