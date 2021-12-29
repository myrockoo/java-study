import java.util.Scanner;

public class Jungol_109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 3; i++) {
			int num = sc.nextInt();
			sum += num;
			}
		sc.close();
		System.out.printf("sum = %d\navg = %d", sum, sum / 3);
	}

}
