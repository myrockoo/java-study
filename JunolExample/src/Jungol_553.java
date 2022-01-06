import java.util.Scanner;

public class Jungol_553 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int cnt = 0;
		
		for(int i = 0; i < num; i++) {
			for (int j = num - i; j > 0; j--) {
				System.out.print((char) (cnt +'A'));
				cnt++;
			}
			System.out.println();
		}
	}

}
