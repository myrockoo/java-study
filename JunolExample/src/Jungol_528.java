import java.util.Scanner;

public class Jungol_528 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int b = 1;
		if (num < 0)
			b *= 0;

		switch (b) {
		case 1:
			System.out.println(num);
			break;
		case 0:
			System.out.println(num + "\nminus");
			break;
		}
	}
}
