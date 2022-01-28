import java.util.Scanner;

public class Jungol_155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char arrC[] = { 'J', 'U', 'N', 'G', 'O', 'L' };
		char c = sc.next().charAt(0);
		int n = -1;
		sc.close();

		for (int i = 0; i < arrC.length; i++) {
			if (arrC[i] == c) {
				n = i;
				break;
			}			
		}
		if(n == -1)
			System.out.println("none");
		else
			System.out.println(n);
	}
}