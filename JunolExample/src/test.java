import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if (num > 1)
			for (int i = 1; i <= num; i++)
				System.out.print(i + " ");
//		else if (num < 0) {
//			int minus = Math.abs(num);
//			for(int i = 1; i <= minus + 2; i++) {
//				System.out.print(2 - i + " ");
//			}
//		}
		else if (num < 1) {
			for (int i = 1; i >= num; i--) {
				System.out.println(i + " ");
			}
		}
	}
}