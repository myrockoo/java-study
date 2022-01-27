import java.util.Scanner;

public class Baekjoon_10757 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();

		int max = Math.max(a.length(), b.length());
		int arr[] = new int[max];
		int al = a.length() - 1;
		int bl = b.length() - 1;

		for (int i = 0; i < max; i++) {
			if (al == -1 && bl == -1)
				break;
			else if (al == -1) {
				arr[i] += b.charAt(bl--) - '0';
			} else if (bl == -1) {
				arr[i] += a.charAt(al--) - '0';
			} else {
				arr[i] += a.charAt(al--) - '0' + b.charAt(bl--) - '0';
			}
			if (i < max - 1 && arr[i] > 9) {
				arr[i] %= 10;
				arr[i + 1] += 1;
			}
		}
		for (int i = max - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}
