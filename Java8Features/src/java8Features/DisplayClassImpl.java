package java8Features;

public class DisplayClassImpl implements DisplayInterface {

	public static void main(String[] args) {
		System.out.println("Test Class Cretaed for Functional Interface");
		
		new DisplayClassImpl().sayHello();
//		new DisplayClassImpl().sayBye();
		new DisplayClassImpl().sayGoodMorning();
		
		DisplayInterface.sayStaticGoodMorning();
	}

	@Override
	public void sayHello() {
		System.out.println("Hello From class");
	}

	public void sayGoodMorning() {
		System.out.println("This is public method Good Morning");
	}

//	@Override
//	public void sayBye() {
//		System.out.println("Bye From the class");
//		
//	}

}
