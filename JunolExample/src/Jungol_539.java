import java.util.Scanner;

public class Jungol_539 {

	public static void main(String[] args) {
		boolean b = true;
		int sum = 0, cnt = 0;

		Scanner sc = new Scanner(System.in);
		while (b) {
			int num = sc.nextInt();
			sum += num;
			cnt += 1;
			if (num >= 100)
				b = false;
		}
		sc.close();
		System.out.println(sum);
		System.out.printf("%.1f", (double)sum / cnt);
	}

}
