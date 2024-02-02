package coading_ques.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//  to square the numbers
public class G {

	public static void main(String[] args) {
		List<Integer> val=Arrays.asList(2,3,4,5,6,7);
		List<Integer> square = val.stream().map(n-> n*n).
				collect(Collectors.toList());
		System.out.println(square);
	}
}
