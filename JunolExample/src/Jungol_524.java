import java.util.Scanner;

public class Jungol_524 {

	public static void main(String[] args) {
		boolean answer = true;
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.print((num1 * num2 ) != 0 ? answer : !answer);
		System.out.print(" ");
		System.out.println((num1 + num2) != 0 ? answer : !answer);		
	}

}
