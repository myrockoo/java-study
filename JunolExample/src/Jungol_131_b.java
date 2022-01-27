import java.util.Scanner;

public class Jungol_131_b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		for(int i = Math.min(n, m); i <= Math.max(n, m); i++) {
			System.out.print(i + " ");
		}
	}
}
