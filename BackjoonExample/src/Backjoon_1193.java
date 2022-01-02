import java.util.Scanner;

public class Backjoon_1193 {

	public static void main(String[] args) {
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int cnt = 0, line = 1, test = 0;

		while (b) {
			for (int i = 0; i < line; i++) {
				cnt++;
				if (cnt == num) {
					test = i;
					b = false;
					break;
				}
			}
			if (b == false)
				break;
			line++;
		}
		if (line % 2 == 1)
			System.out.printf("%d/%d", line - test, test + 1);
		else 
			System.out.printf("%d/%d", test + 1, line - test);

	}
}
