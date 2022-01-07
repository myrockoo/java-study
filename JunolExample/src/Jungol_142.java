import java.util.Scanner;

public class Jungol_142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int cnt = num;

		while (true) {
			if (cnt < num * 2) {
				for (int i = 0; i <= cnt - num; i++) {
					System.out.print("*");
				}
				cnt++;
			} else {
				for (int i = 0; i < num - 1; i++) {
					System.out.print("*");
				}
				num--;
				if (num == 0)
					break;
			}
			System.out.println();
		}
	}
}
