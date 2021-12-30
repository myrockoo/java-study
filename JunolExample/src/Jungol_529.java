import java.util.Scanner;

public class Jungol_529 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();

		int bmi = weight + 100 - height;

		System.out.println(bmi < 0 ? bmi : bmi + "\nObesity");
//		if (bmi > 0)
//			System.out.print("Obesity");
	}

}
