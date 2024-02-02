package coading_ques.string;

import java.util.Scanner;

//  program to print Fabonacci series in java

public class B {

	public static void main(String[] args) {
		int a = 0, b = 1, c, term;

		Scanner scan = new Scanner(System.in); // It take the user input
		System.out.println("Enter The term"); // it print statement enter term
		term = scan.nextInt();

		for (int i = 0; i < term; i++) { // here for loop run depending on user input
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
//Enter The term
//9
//0
//1
//1
//2
//3
//5
//8
//13
//21

