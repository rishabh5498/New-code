package coading_ques.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// program to sort a given numbers
public class J {

	public static void main(String[] args) {
		List<Integer> val=Arrays.asList(12,45,62,85,7,62);
		List<Integer> newval=val.stream().sorted().collect(Collectors.toList());
		System.out.println(newval);
	}
}
