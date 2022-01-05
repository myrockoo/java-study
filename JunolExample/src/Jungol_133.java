import java.util.Scanner;

public class Jungol_133 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0, cnt = 0;
		for(int i = 0; i < num; i++) {
			int score = sc.nextInt();
			sum += score;
			cnt++;
		}
		sc.close();
		System.out.printf("%.2f", (double) sum / cnt);
	}

}
