package jan_21;

import java.util.Arrays;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("서울시", "중부", "기술", "교육원");
		for (String name : list1) {
			System.out.print(name + " ");
		}
		System.out.println();
//		list1.add(2,"남부");

		List<Integer> list2 = Arrays.asList(4, 3, 8, 1, 9, 2);
		for (int value : list2) {
			System.out.print(value + " ");
		}

	}

}
