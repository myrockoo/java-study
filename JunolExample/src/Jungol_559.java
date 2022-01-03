import java.util.Scanner;

public class Jungol_559 {
	public static void main(String[] args) {
		double arr[] = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		System.out.printf("%.1f", arr[num - 1] + arr[num2 - 1]);
	}
}
