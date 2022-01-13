import java.util.Scanner;

public class Jungol_148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int cnt = num * num;

		for (int i = 1; cnt > 0; i++) {
			for (int j = 1; j <= num; j++) {
				if (i < j)
					break;
				if (i - j >= num)
					System.out.print("  ");
				else {
					System.out.print("# ");
					cnt--;
				}
			}System.out.println();
		}

	}

}
