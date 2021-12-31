import java.util.Scanner;
public class Jungol_532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double num2 = sc.nextDouble();
		sc.close();

		int Case = 0;

		if (num >= 4.0 && num2 >= 4.0)
			Case = 1;
		else if (num >= 3.0 && num2 >= 3.0)
			Case = 2;
		else
			Case = 3;

		switch (Case) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
		}
	}
}
