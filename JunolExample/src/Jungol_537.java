import java.util.Scanner;

public class Jungol_537 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		
		while(num != 0) {
			sum += num;
			num--;
		}
		System.out.println(sum);
	}
}
