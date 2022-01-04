import java.util.Scanner;

public class Jungol_129 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			System.out.printf("Triangle width = %.1f\n", (double) base * height /2);
			System.out.println("Continue?");
			char c = sc.next().charAt(0);
			if (c == 'Y' || c =='y')
				continue;
			else
				break;
		}
		sc.close();
	}

}
