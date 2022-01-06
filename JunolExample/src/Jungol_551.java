import java.util.Scanner;

public class Jungol_551 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < n; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for(int j = n; j-i> 0; j--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
