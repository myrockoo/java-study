import java.util.Scanner;

public class Jungol_525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		System.out.print((num1 > num2) && (num1 > num3) ? 1 : 0);
		System.out.print(" ");
		System.out.println((num1 == num2) && (num1 == num3) ? 1 : 0);
	}
}
