
public class b_ArrayExample {

	public static void main(String[] args) {
		int score[] = { 83, 90, 87 };

		for (int i = 0; i < score.length; i++) {
			System.out.println("score [" + i + "] : " + score[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("sum : " + sum);
	}

}
