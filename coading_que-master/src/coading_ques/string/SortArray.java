package coading_ques.string;

public class SortArray {
	public static void main(String[] args) {
		int[] x = { 25, 47, 56, 12, 36, 85, 45 };
		int temp;
		for (int j = 0; j < x.length - 1; j++) {
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] > x[i + 1]) {
					temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println(x[x.length - 1]);
		System.out.println(x[x.length - 2]);
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}