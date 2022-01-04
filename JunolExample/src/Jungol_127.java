import java.util.Scanner;

public class Jungol_127 {

	public static void main(String[] args) {
		int sum = 0, cnt = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			int num = sc.nextInt();
			if (num < 0 || num > 100)
				break;
			sum += num;
			cnt++;
		}
		sc.close();
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f" ,(double)sum / cnt);			
	}
}
