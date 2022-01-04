import java.util.Scanner;

public class Baekjoon_10809_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int arr[] = new int[26];
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for (int i = 0; i < S.length(); i++) {
			if (arr [S.charAt(i) - 'a'] == -1)
				arr[S.charAt(i) - 'a'] = cnt++;
			else
				cnt++;
		}
		
		for (int i : arr) {
			System.out.print(cnt + " ");
		}
		
	}
}