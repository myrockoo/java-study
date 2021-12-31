import java.util.Scanner;

public class Jungol_632 {

	public static void main(String[] args) {
		int[] arr = new int[3];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++)
			arr[i] = sc.nextInt();
		sc.close();

		int tmp = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			if (tmp > arr[i + 1]) {
				tmp = arr[i + 1];
			}
		}
		System.out.println(tmp);

	}
}
