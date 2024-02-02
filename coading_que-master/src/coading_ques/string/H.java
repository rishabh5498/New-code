package coading_ques.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//   program to get String starting char with B
public class H {
//	public static void main(String[] args) {
//
//		List<String> str=Arrays.asList("sunil","akash","sachin","balaji","gaju");
//		List<String> strnew=str.stream().filter(s-> s.startsWith("b")).
//		collect(Collectors.toList());
//		System.out.println(strnew);
//	}
	
//  program to get String ends char with n
	public static void main(String[] args) {
		List<String> str=Arrays.asList("sunil","akash","sachin","balaji","gaju","ankush");
		List<String> strnew=str.stream().filter(s-> s.endsWith("h")).
		collect(Collectors.toList());
		System.out.println(strnew);
	}
}
