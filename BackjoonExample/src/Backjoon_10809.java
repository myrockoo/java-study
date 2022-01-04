import java.util.Scanner;

public class Backjoon_10809 {

	public static void main(String[] args) {
		boolean b[] = new boolean[26];
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		int arr[] = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 'a' + i;
		}
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((int) str.charAt(i) == arr[j]) {
					arr[j] = i;
					b[j] = true;
					break;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (b[i] == false)
				arr[i] = -1;
			System.out.print(arr[i] + " ");
		}
	}

}
