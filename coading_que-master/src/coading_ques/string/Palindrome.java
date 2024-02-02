package coading_ques.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n, r, s = 0, c;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n = scan.nextInt();
		c = n;
		while (n > 0) {
			r = n % 10;
			s = (s * 10) + r;
			n = n / 10;
		}
		if (c == s) {
			System.out.println("Its palindrome No");
		} else {
			System.out.println("Not palindrome No");
		}
	}
}
