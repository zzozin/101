package class101web;

public abstract class Pet {
	String name;
	
	public Pet(String name) {
		this.name = name;
		//this는 같은 이름을 구별하기 위함
	}
	
	void eat() {
		System.out.println(name+"이(가)밥을 먹어요.");
	}
	
	public abstract void bark();
}
