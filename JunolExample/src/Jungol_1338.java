import java.util.Scanner;

public class Jungol_1338 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - 1; j++) {
				System.out.print("  ");
			}
			int k = i;
			for(int j = 0; j <= i; j++) {
				k += n - j;
				System.out.print((char) ('A' + ((k - n) % 26))+ " ");
			}
			System.out.println();
		}
	}
}
