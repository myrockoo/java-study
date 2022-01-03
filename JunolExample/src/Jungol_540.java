import java.util.Scanner;

public class Jungol_540 {

	public static void main(String[] args) {
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		while(b) {
			int num = sc.nextInt();
			System.out.print(num % 3 == 0 ? (num / 3) + "\n" : "");
			if (num == -1)
				b = false;
		}
		sc.close();
		
	}

}
