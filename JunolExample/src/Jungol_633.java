import java.util.Scanner;

public class Jungol_633 {

	public static void main(String[] args) {
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		while (b) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.println("number?");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("Seoul\n");
				break;
			case 2:
				System.out.println("Washington\n");
				break;
			case 3:
				System.out.println("Tokyo\n");
				break;
			case 4:
				System.out.println("Beijing\n");
				break;
			default :
				System.out.println("none\n");
				b = false;
			}

		}
		sc.close();

	}

}
