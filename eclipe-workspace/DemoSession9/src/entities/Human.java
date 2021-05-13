package entities;

public class Human implements IHuman, IB, IC {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Human(String name) {
		super();
		this.name = name;
	}

	public Human() {
		super();
	}

	@Override
	public void sleep() {
		System.out.println("Con nguoi ngu");
	}

	@Override
	public void eat() {
		System.out.println("Con nguoi an");
	}

	@Override
	public void b1() {
		System.out.println("b1");
	}

	@Override
	public void b2() {
		System.out.println("b2");
	}

	@Override
	public void d1() {
		System.out.println("d1");
	}

	@Override
	public void d2() {
		System.out.println("d2");
	}

	@Override
	public void e1() {
		System.out.println("e1");
	}

	@Override
	public void e2() {
		System.out.println("e2");
	}

	@Override
	public void c1() {
		System.out.println("c1");
	}

	@Override
	public void c2() {
		System.out.println("c2");
	}

}
