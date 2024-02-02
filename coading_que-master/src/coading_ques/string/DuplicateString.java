package coading_ques.string;

public class DuplicateString {

	public static void main(String[] args) {
		String str = "programmer";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int ind = str.indexOf(ch, i + 1);
			if (ind == -1) {
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
}
