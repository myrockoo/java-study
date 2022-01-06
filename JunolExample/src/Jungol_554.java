import java.util.Scanner;

public class Jungol_554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int cnt = 1, cnt2 =0;
		
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(cnt + " ");
				cnt++;
			}
			for(int j = 0; j <= i; j++) {
				System.out.print((char) (cnt2 + 'A') +" ");
				cnt2++;
			}
			System.out.println();
		}
	}

}
