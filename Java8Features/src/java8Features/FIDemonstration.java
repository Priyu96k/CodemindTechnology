package java8Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FIDemonstration {

	public static void main(String[] args) {
		
		Predicate<Integer> prTest = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer num) {
				if(num > 100) {
					System.out.println("Greater Than 100");
				}else {
					System.out.println("Less Than 100");
				}
				return false;
			}
		};
		
		Consumer<String> consumer = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		
		Function<String, String> fun = new Function<String, String>() {
			
			@Override
			public String apply(String t) {
				
				t= t.toUpperCase();
				
				return t;
			}
		};
		
		Supplier<String> sup = new Supplier<String>() {
			
			@Override
			public String get() {
				String msg = "Hello from Supplier interface";
				return msg;
			}
		};
		
		prTest.test(45);
		
		consumer.accept("Hello Consumer !!");
		
		String caps = fun.apply("hello function interface !!");
		System.out.println(caps);
		
		String getmsg = sup.get();
		System.out.println(getmsg);
	}

}

/**
 * Anonymous class implements Predicate<>
 *  
 */
