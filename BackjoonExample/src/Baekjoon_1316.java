import java.util.Scanner;

public class Baekjoon_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(), cnt = 0;
//		String arr[] = new String[T];
		for (int i = 0; i < T; i++) {
			int arr[10] = {0};
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				if (arr[str.charAt(j) - 'a'] == 1) {
					cnt++;
					break;
				} else
					arr[str.charAt(j) - 'a'] += 1;
			}
		}
		sc.close();
		System.out.println(T-cnt);
	}
}
