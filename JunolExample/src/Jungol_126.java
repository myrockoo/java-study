import java.util.Scanner;

public class Jungol_126 {

	public static void main(String[] args) {
		int odd = 0, even = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			int num = sc.nextInt();
			if (num == 0) {
				sc.close();
				break;
			}
			else if (num % 2 == 0)
				even += 1;
			else
				odd += 1;				
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}

}
