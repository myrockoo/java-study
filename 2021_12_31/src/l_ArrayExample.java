
public class l_ArrayExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };

		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i]; // sum = sum + scores[i];
		}
		System.out.println("sum : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("avg : " + avg);

	}
}
