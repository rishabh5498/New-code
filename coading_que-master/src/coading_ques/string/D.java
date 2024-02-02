package coading_ques.string;

//  swapping two no without using third variable

public class D {

	public static void main(String[] args) {
		int a = 10, b = 20;

		a = a + b; // now a is 30

		b = a - b; // now b is 10

		a = a - b; // now a is 20

		System.out.println(a); // 20
		System.out.println(b); // 10
	}
}
