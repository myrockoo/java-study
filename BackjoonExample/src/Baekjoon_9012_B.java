import java.util.Scanner;

public class Baekjoon_9012_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			String str = sc.next();
			
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(')
					cnt++;
				else if(str.charAt(j) == ')')
					cnt--;
				if(cnt < 0)
					break;
			}
			if (cnt == 0)
				System.out.println("YES");
			else
				System.out.println("NO");			
		}
		sc.close();
	}
}
