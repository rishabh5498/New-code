package coading_ques.string;

//  Swappint two no with using third variable

public class C {

	public static void main(String[] args) {
		int a = 12, b = 20, c;
		c = a;
		a = b;
		b = c;
		System.out.println(a);   // 20
		System.out.println(b);   // 10
	}
}
