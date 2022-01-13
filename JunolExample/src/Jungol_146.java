import java.util.Scanner;

public class Jungol_146 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int cnt = 0;
		int k = 0;

		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < num; j++) {
				if (num - j - i >= 0) {
					System.out.printf("%c ", cnt + 'A');
					cnt++;
				} else {
					System.out.printf("%d ", k);
					k++;
				}
			}
			System.out.println();
		}
	}

}
