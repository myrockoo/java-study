import java.util.Scanner;

public class Backjoon_9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String str[] = new String[cnt];
		
		for (int i = 0; i < cnt; i++) {
			int answer = 0;
			str[i] = sc.next();
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == '(')
					answer += 1;
				else if (str[i].charAt(j) == ')')
					answer -= 1;
				if (answer < 0)
					break;
			}
			if (answer == 0)
				System.out.println("YES");
			else if (answer != 0)
				System.out.println("NO");
		}
		sc.close();
	}
}
