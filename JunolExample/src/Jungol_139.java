import java.util.Scanner;

public class Jungol_139 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if (num > num2) {
			for (int i = 1; i <= 9; i++) {
				for (int j = num; j  - num2 >= 0; j--) {
					if (i * j < 10)
						System.out.printf("%d * %d =  %d   ", j, i, j * i);
					else
						System.out.printf("%d * %d = %d   ", j, i, j * i);
				}
				System.out.println();
			}
		} else if (num <= num2) {
			for (int i = 1; i <= 9; i++) {
				for (int j = num; j <= num2; j++) {
					if (i * j < 10)
						System.out.printf("%d * %d =  %d   ", j, i, j * i);
					else
						System.out.printf("%d * %d = %d   ", j, i, j * i);				}
				System.out.println();

			}
		}
	}
}
