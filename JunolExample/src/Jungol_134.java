import java.util.Scanner;

public class Jungol_134 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int even = 0, odd = 0;
		for (int i = 0; i  < 10; i++) {
			int num = sc.nextInt();
			if(num % 2 == 0)
				even += 1;
			else
				odd += 1;			
		}
		sc.close();
		
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
	}

}
