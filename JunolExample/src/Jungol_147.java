import java.util.Scanner;

public class Jungol_147 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int cnt = 1;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j - i >= 0) {
					System.out.print(cnt + " ");
					cnt++;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
