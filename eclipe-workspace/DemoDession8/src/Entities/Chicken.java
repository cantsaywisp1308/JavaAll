package Entities;

public class Chicken extends Animal{

	public Chicken() {
	}
	
	public Chicken(String name) {
		super(name);
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Con ga "+ super.getName()+ " gáy o o o");
	}
	
	
}
