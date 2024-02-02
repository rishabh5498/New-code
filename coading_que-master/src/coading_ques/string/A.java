package coading_ques.string;

//   how to count Occurances of a character in a string

public class A {

	public static void main(String[] args) {
		String str = "sagar";
		int a = str.length(); // totol length
		int b = str.replace("a", "").length(); // replace a with empty
		int c = a - b;
		System.out.println("Number of Ocurance of a is" + c);
//		Number of Ocurance of a is2
	}
}
