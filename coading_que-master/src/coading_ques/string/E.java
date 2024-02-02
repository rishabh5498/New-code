package coading_ques.string;

import java.util.ArrayList;
import java.util.Iterator;

//  write a arrayList program

public class E {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);

		System.out.println(a1);

		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(40);
		a2.add(50);
		System.out.println(a2);
		a1.addAll(1, a2);
		System.out.println(a1);                

		if (a1.contains(20)) {
			System.out.println("Yes Present");
		} else {
			System.out.println("Not present");
		}

		Iterator<Integer> itr = a1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(a1.isEmpty());

		for (Integer it : a1) {
			System.out.println(it);
		}
	}
}

//[10, 20, 30]
//[40, 50]
//[10, 40, 50, 20, 30]
//Yes Present
//10
//40
//50
//20
//30
//false
//10
//40
//50
//20
//30

