import java.util.Scanner;

public class Baek_joon_2447 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				recursion(i, j, n);
			}
			System.out.println();
		}

	}

	static void recursion(int i, int j, int n) {
		if ((i/n) % 3 == 1 && (j/n) % 3 == 1)
			System.out.print(" ");
		else {
			if (n / 3 == 0)
				System.out.print("*");
			else
				recursion(i, j, n / 3);
		}
	}

}
