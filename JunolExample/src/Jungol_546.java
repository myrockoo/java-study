import java.util.Scanner;

public class Jungol_546 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int score = sc.nextInt();
			sum += score;
		}
		sc.close();
		System.out.printf("avg : %.1f\n", (double) sum / n);
		if ((double) sum / n >= 80)
			System.out.println("pass");
		else
			System.out.println("fail");
	}

}
