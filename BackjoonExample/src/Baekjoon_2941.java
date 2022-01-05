import java.util.Scanner;

public class Baekjoon_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		char c[] = new char[103];
		for (int i = 0; i < str.length(); i++)
			c[i] = str.charAt(i);

		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (c[i] == 'c' && (c[i + 1] == '=' || c[i + 1] == '-')) {
				cnt++;
				i++;
			} else if (c[i] == 'l' && c[i + 1] == 'j') {
				cnt++;
				i++;
			} else if (c[i] == 'n' && c[i + 1] == 'j') {
				cnt++;
				i++;
			} else if (c[i] == 's' && c[i + 1] == '=') {
				cnt++;
				i++;
			} else if (c[i] == 'd' && c[i + 1] == '-') {
				cnt++;
				i++;
			} else if ((c[i] == 'd' && c[i + 1] == 'z') && c[i + 2] == '=') {
				cnt++;
				i += 2;
			} else if (c[i] == 'z' && c[i + 1] == '=') {
				cnt++;
				i++;
			} else
				cnt++;
		}
		System.out.println(cnt);
	}

}
