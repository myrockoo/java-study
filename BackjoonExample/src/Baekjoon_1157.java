import java.util.Scanner;

public class Baekjoon_1157 {

	public static void main(String[] args) {
		int arr[] = new int[26];
		int max = 0, max2 = 0, max3 = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				arr[str.charAt(i) - 'a'] += 1;
			else
				arr[str.charAt(i) - 'A'] += 1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
				max2 = i;
			}
			max = 0;
		}
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] >= max) {
				max = arr[i];
				max3 = i;
			}
		}
		System.out.println(max2);
		System.out.println(max3);
		System.out.println((char)(max2 +'A'));
		System.out.println(arr[max2] == arr[arr.length - max3] ? "?" : (char) (max +'A'));

	}

}
