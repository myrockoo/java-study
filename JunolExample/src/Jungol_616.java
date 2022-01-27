import java.util.Scanner;

public class Jungol_616 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int xSum = 0, ySum = 0;

		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0)
				xSum += sc.nextInt();
			else
				ySum += sc.nextInt();
		}
		sc.close();
		
		System.out.printf("(%.1f, %.1f)", xSum / 3.0, ySum / 3.0);
	}
}
