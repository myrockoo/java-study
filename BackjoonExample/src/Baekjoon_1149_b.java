import java.util.Scanner;

public class Baekjoon_1149_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String rgb = null;

		int arr[][] = new int[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
			int sto = 0;
			for (int j = 1; j < 3; j++) {
				if (arr[i][j] < arr[i][j - 1])
					sto = j;
			}
			switch (sto) {
			case 0:
				rgb += "r";
				break;
			case 1:
				rgb += "g";
				break;
			case 2:
				rgb += "b";
			}
		}
		System.out.println(rgb);

	}

}
