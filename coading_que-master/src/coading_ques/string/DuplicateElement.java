package coading_ques.string;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] x = { 1, 1, 2, 3, 4, 4, 5, 5, 6 };
		int[] temp = new int[x.length];
		int j = 0;

		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] != x[i + 1]) {
				temp[j] = x[i];
				j++;
			}
		}
		System.out.println(j);
		temp[j] = x[x.length - 1];
		for (int z = 0; z < 1 + j; z++) {
			System.out.println(temp[z]);
		}
	}
}
