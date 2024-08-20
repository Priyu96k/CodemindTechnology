package java8Features;

@FunctionalInterface
public interface DisplayInterface {

	void sayHello();
//	void sayBye();
	
	default void sayGoodMorning() {
		System.out.println("This is default method Good Morning in interface");
	}
	
	public static void sayStaticGoodMorning() {
		System.out.println("This is public static method Good Morning in interface");
	}

}

/**
 * Functional Interface
 * 1. Functional interface created by giving annotation @FunctionalInterface 
 * 2. Any interface having only and only one method(Abstract method) SAM(Single Abstract Method) interface
 * 3. it Contains one or more default and static methods
 * 4. Example: Comparator, Runnable, Collable, etc...
 * 
 * 
 * It Has four Types
 *  
 *  T is type of variable, R is return type 
 *  
 * 1. Predicate<T>  -> boolean test(T t) = to test something
 * 2. Consumer<T>   -> void accept(T t) = to consume it and use it
 * 3. Function<T,R> -> R apply(T t) = to process something
 * 4. Supplier<T>   -> T get() = to get something
 
 */
