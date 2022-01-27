import java.util.Scanner;

public class Baekjoon_1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() + 1;
		int arr[][] = new int[n][3];
		int rgb = 0, rgb2 = 0, sto = 0, sum = 0;

		for (int i = 0; i < n; i++) {
			rgb = 0;
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
			sto = arr[i][0];
			for (int j = 1; j < 3; j++) {
				if (rgb != j && arr[i][j] == sto) {
					for (int k = 1; k < 3; k++)
						if (arr[i + 1][k] < arr[i + 1][k - 1]) {
							rgb = k;
							sto = arr[i][j];
						}
				}

				if (rgb2 != i && arr[i][j] < arr[i][j - 1]) {
					rgb = j;
					sto = arr[i][j];
				}
			}
			rgb2 = rgb;
			rgb = 0;
			sum += sto;
			System.out.println(sum);
		}
		sc.close();
		System.out.println(sum);
	}

}
