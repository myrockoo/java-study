import java.util.Scanner;

public class Jungol_153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[100];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] == -1) {
				if (i > 3)
					System.out.print(ar[i - 3] + " " + ar[i - 2] + " " + ar[i - 1]);
				else if (i == 2)
					System.out.print(ar[i - 2] + " " + ar[i - 1]);
				else if (i == 1)
					System.out.print(ar[i - 1] + " ");
				break;
			}
		}
		sc.close();
	}
}
