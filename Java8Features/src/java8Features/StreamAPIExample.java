package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {
		
		List<String> weekDays = Arrays.asList("Monday","Tuesday","Wednesday","Thrusday",
				"Friday","Saturaday","Sunday");
		
		// 1
		for (int i = 0; i < weekDays.size(); i++) {
			System.out.println(i);
		}
		
		// 2
		for (String days:weekDays) {
			System.out.println(days);
		}
		
		// 3.... Using StreamAPI
		weekDays.stream().forEach(day -> System.out.println(day));
		
		List<String> distinctWeekDays = weekDays.stream().distinct().collect(Collectors.toList());
		
		distinctWeekDays.stream().forEach(day->System.out.println(day));
		
		List<String> tnameWeekdays= weekDays.stream().
				filter(day->day.startsWith("T")).collect(Collectors.toList());
		
		tnameWeekdays.stream().forEach(day->System.out.println(day));
		
		List<Integer> runs = Arrays.asList(6,2,4,4,2,6);
		
		if(runs.stream().anyMatch(num-> num>=6)) {
			System.out.println("In this over we got hit a six");
		}else {
			System.out.println("No six got hit in this over");
		}
		
		
		// 4 Method Referance => can be only use only replace by lambda expression
		
		weekDays.stream().forEach(System.out::println);
		

	}

}
