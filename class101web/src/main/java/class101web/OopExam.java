package class101web;

public class OopExam {
	
	public OopExam() {
		Dog a = new Dog("강아지");
		a.bark();
		
		Cat b = new Cat("냥이");
		b.bark();
		
		//Pet.pet = new cat("나비");
		//pet.bark(); abstract클래스 사용해서 호환,다형성 가능
		
	}

	public static void main(String[] args) {
		OopExam app = new OopExam();

	}

}
