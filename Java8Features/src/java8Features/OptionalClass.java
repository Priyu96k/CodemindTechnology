package java8Features;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		OptionalClass obj = new OptionalClass();
		obj.display();
		
		Optional<OptionalClass> Opobj = Optional.ofNullable(null);
		
		if(Opobj.isPresent()) {
			obj.display();
		}else {
			System.out.println("obj is null...");
		}
		
	}
	
	public void display() {
		System.out.println("From display method");
	}

}
