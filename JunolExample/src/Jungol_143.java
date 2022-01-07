import java.util.Scanner;

public class Jungol_143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i; j++)
				System.out.print(" ");
			for(int j = (num - i) * 2 -1  ; j > 0; j--)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i < num; i++) {
			for (int j = num - 1; j > i; j--)
				System.out.print(" ");
			for (int j = 0; j < 2 * (i + 1) -1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
