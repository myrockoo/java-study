import java.util.Scanner;

public class Jungol_1856_b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		int arr[][] = new int[n][m];
		int cnt = 1;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					arr[i][j] += cnt++;
				}
			} else {
				for (int j = 0; j < m; j++) {
					arr[i][j] += cnt++ + m - 2 * j - 1;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
