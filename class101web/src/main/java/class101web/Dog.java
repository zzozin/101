package class101web;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bark() {
		System.out.println(name+":왈왈!");

	}

}
