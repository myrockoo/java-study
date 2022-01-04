import java.util.Scanner;

public class Jungol_545 {

	public static void main(String[] args) {
		int three = 0, five = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			if (num % 3 == 0)
				three += 1;
			if (num % 5 == 0)
				five += 1;			
		}
		sc.close();
		System.out.println("Multiples of 3 : " + three);
		System.out.println("Multiples of 5 : " + five);
	}

}
