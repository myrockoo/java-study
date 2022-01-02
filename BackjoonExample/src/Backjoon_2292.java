import java.util.Scanner;

public class Backjoon_2292 {

	public static void main(String[] args) {
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		sc.close();

		long cnt = 1, line = 1;

		if (num == 1)
			System.out.println(line);
		else
			while (b) {
				for (long i = 0; i < (line * 6); i++) {
					cnt++;
					if (cnt == num) {
						b = false;
						System.out.println(line + 1);
						break;
					}

				}
				line++;
			}
	}

}
