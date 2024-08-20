package java8Features;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FIAssignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		System.out.println("Functional INterfaces TYpes");
		System.out.println("************************************");
		System.out.println();
		System.out.println("Predicate Interface");

		Predicate<Integer> prTest = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer num) {
				if(num % 2 == 0 ) {
					System.out.println("Number is Even");
				}else {
					System.out.println("Number is Odd");
				}
				return false;
			}
		};
		prTest.test(num);
		
		System.out.println();
		System.out.println("************************************");
		System.out.println();
		System.out.println("Consumer Interface");
		
		Consumer<String> consumer = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		
		consumer.accept("Hello Consumer !!");
		
		System.out.println();
		System.out.println("************************************");
		System.out.println();
		System.out.println("Function Interface");
		
		Function<Integer,Integer> fun= new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				int cube = t*t*t;
				return cube;
			}
		};
		
		Integer caps = fun.apply(num);
		System.out.println("Cube of number is: "+caps);
		
		System.out.println();
		System.out.println("************************************");
		System.out.println();
		System.out.println("Supplier Interface");
		
		Supplier<String> sup = new Supplier<String>() {
			
			@Override
			public String get() {
				String msg = " Supplier interface";
				
				return msg;
			}
		};
			
		String getmsg = sup.get();
		System.out.println("Hello I am "+getmsg);
	}

}
