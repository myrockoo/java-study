import java.util.Scanner;

public class Jungol_564 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[26];

		while (true) {
			char c = sc.next().charAt(0);
			if (c > 'Z' || c < 'A')
				break;
			arr[c - 'A']++;
		}
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				System.out.println((char) (i + 'A') + " : " + arr[i]);
		}
	}
}
