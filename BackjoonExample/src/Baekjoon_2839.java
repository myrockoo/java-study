import java.util.Scanner;

public class Baekjoon_2839 {

	public static void main(String[] args) {
		int third = 0, a = 0;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int five = n / 5;
		int cnt = five;

		while (true) {
			a = n % 5 + ((cnt - five) * 5);
			if (a == 0) {
				System.out.println(five);
				break;
			}

			third = a / 3;
			a %= 3;
			if (a == 0) {
				System.out.println(five + third);
				break;
			} else {
				if (five == 0) {
					System.out.println(-1);
					break;
				}
				five--;
			}
		}
	}
}
