package class101web;

import java.util.ArrayList;
import java.util.List;

public class JavaExam {
	static String shopName;
	List<Product> plist;
	
	//생성자 (생성자 필수X 옵션)
	public JavaExam(){
		plist = new ArrayList<>();
		genProduct();
		
	}
	
	 void genProduct() {
		 Product p = new Product();
		 p.setName("삼성폰");
		 p.setPrice(11111);
		 plist.add(p);
		 
		 p = new Product();
		 p.setName("아이폰");
		 p.setPrice(22222);
		 plist.add(p);
		 
		 p = new Product();
		 p.setName("노키아");
		 p.setPrice(33333);
		 plist.add(p);
	 }
	 
	 void showProductList() {
		 System.out.println("## "+shopName+" ##");
		 System.out.println("상품\t\t가격");
		 System.out.println("=======================");
		 for(Product p : plist) {
			 System.out.printf("%s\t\t%d\n", p.getName(),p.getPrice());
			//( /t는 tab역활 공백만들어줌)
		 }
	 }
	
	public static void main(String[] args) {
		
	
		JavaExam app = new JavaExam();
		JavaExam.shopName = "클래스101몰";
		app.showProductList();

	}

}
//Run As의 Java Application으로도 실행가능
