import java.util.Scanner;

public class Jungol_138 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
	}

}
