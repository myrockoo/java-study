import java.util.Scanner;

public class Jungol_1856 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= m; j++) {
					System.out.print(i * m + j + " ");
				}
			} else {
				for (int j = m; j > 0; j--) {
					System.out.print(i * m + j + " ");
				}
			}
			System.out.println();
		}
	}
}
