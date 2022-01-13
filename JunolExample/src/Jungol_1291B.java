import java.util.Scanner;

public class Jungol_1291B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s, e;

		while (true) {
			s = sc.nextInt();
			e = sc.nextInt();
			if (s < 2 || e < 2 || s > 9 || e > 9)
				System.out.println("INPUT ERROR!");
			else
				break;
		}
		sc.close();

		for (int i = 1; i <= 9; i++) {
			if (s >= e) {
				for (int j = s; j >= e; j--)
					System.out.printf("%d *%2d =%3d   ", j, i, i * j);
			} else if (s < e) {
				for (int j = s; j <= e; j++)
					System.out.printf("%d *%2d =%3d   ", j, i, i * j);
			}
			System.out.println();
		}
	}
}