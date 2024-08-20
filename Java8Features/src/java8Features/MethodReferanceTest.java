package java8Features;


interface DisplayMethodInterface{
	void display();
}

public class MethodReferanceTest {
	
	public  MethodReferanceTest() {
		System.out.println("Hello from methos referance class Constructor...");
		
	}
	
	public static void mrtest() {
		System.out.println("Hello from methos referance class static method...");
	}
	
	public void mrtest_nonstatic() {
		System.out.println("Hello from methos referance class non static method...");
	}

	public static void main(String[] args) {
		
		MethodReferanceTest obj =new MethodReferanceTest();
		
		DisplayMethodInterface DMI = ()-> System.out.println("hello there from lamda expression");
		
		DMI.display();
		
		DisplayMethodInterface DMI2 = MethodReferanceTest::mrtest;
		
		DMI2.display();
		
		DisplayMethodInterface DMI3 = obj::mrtest_nonstatic;
		
		DMI3.display();
		
		DisplayMethodInterface DMI4 = MethodReferanceTest::new;	
		
		DMI4.display();


		
		
		/**
		 * Method Referance are 3 types
		 * 1. static method Ref
		 * 2. instance method Ref
		 * 3. Constructor method Ref
		 */
		
		
	}

}
