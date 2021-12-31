import java.util.Scanner;

public class Jungol_530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();

		if (age >= 20)
			System.out.print("adult");
		else
			System.out.print(20 - age + " years later");
	}
}
