import java.util.Scanner;

public class Jungol_156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 999;

		for (int i = 0; i < 100; i++) {
			int k = sc.nextInt();
			if (k == 999)
				break;
			max = Math.max(max, k);
			min = Math.min(min, k);
		}
		sc.close();

		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
