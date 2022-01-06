import java.util.Scanner;

public class Jungol_135 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		int sum = 0, cnt = 0;

		for (int i = min; i <= max; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				cnt++;
			}
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) sum / cnt);

	}

}
