package coading_ques.string;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		int n, count = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime No");
		} else {
			System.out.println("Not Prime No");
		}
	}
}
