import java.util.Scanner;

public class Backjoon_2441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = num; i > 0; i--) {
			for (int j = num; j - i > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
