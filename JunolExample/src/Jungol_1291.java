import java.util.Scanner;

public class Jungol_1291 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s;
		int e;

		while (true) {
			s = sc.nextInt();
			e = sc.nextInt();
			if (s < 2 || s > 9) {
				System.out.println("INPUT ERROR!");
			} else if (e < 2 || e > 9) {
				System.out.println("INPUT ERROR!");
			} else
				break;
		}
		sc.close();

		if (s > e) {
			for (int i = 1; i <= 9; i++) {
				for (int j = s; j >= e; j--) {
					if (i * j > 9) {
						System.out.printf("%d * %d = %d   ", j, i, i * j);
					} else if (i * j < 10) {
						System.out.printf("%d * %d =  %d   ", j, i, i * j);
					}
				}
				System.out.println();
			}
		} else if (s <= e) {
			for (int i = 1; i <= 9; i++) {
				for (int j = s; j <= e; j++) {
					if (i * j > 9) {
						System.out.printf("%d * %d = %d   ", j, i, i * j);
					} else if (i * j < 10) {
						System.out.printf("%d * %d =  %d   ", j, i, i * j);
					}
				}
				System.out.println();
			}
		}
	}
}
