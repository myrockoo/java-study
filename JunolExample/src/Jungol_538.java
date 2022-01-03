import java.util.Scanner;

public class Jungol_538 {

	public static void main(String[] args) {
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		while (b) {
			int num = sc.nextInt();
			System.out.println("number?");
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
