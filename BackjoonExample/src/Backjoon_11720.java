import java.util.Scanner;

public class Backjoon_11720 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String num2 = sc.next();
		sc.close();
		for (int i = 0; i < num; i++) {
			sum += num2.charAt(i) - 48;
		}
		System.out.println(sum);
	}

}
