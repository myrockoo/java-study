import java.util.Scanner;

public class Jungol_538 {

	public static void main(String[] args) {
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		while (b) {
			System.out.println("number?");
			int num = sc.nextInt();
			if (num > 0)
				System.out.println("positive integer");
			else if (num < 0)
				System.out.println("negative number");
			else {
				b = false;
			}
		}
		sc.close();
	}
}
