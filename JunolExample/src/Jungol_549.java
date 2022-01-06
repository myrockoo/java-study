import java.util.Scanner;

public class Jungol_549 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int sum = 0, cnt = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				sum += i;
				cnt++;
			}
			if (sum >= num)
				break;
		}
		System.out.printf("%d %d", cnt, sum);

	}

}
