import java.util.Scanner;

public class Baekjoon_10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int H, W, N;

		for (int i = 0; i < T; i++) {
			H = sc.nextInt();
			W = sc.nextInt();
			N = sc.nextInt();

			if (N % H == 0) {
				System.out.printf("%d\n", H * 100 + N / H);
			} else
				System.out.printf("%d\n", (N % H) * 100 + (N / H) + 1);
		}
		sc.close();
	}
}
