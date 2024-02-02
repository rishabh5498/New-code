package coading_ques.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//  Program to find even no

public class F {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(15, 24, 36, 56, 17, 54);
		System.out.println(arr);  //[15, 24, 36, 56, 17, 54]
				
//		List<Integer> oddnum = arr.stream().filter(n -> n % 2 != 0).
//				collect(Collectors.toList());   // for odd no n%2 !=0
//		System.out.println(oddnum);  // [24, 36, 56, 54]
		
		List<Integer> arreven = arr.stream().filter(n -> n % 2 == 0).
				collect(Collectors.toList()); 
		
		System.out.println(arreven);
	}
}
