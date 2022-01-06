import java.util.Scanner;

public class Jungol_572 {
	
	public static double pi (double f) {
		return (3.14 * f * f);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ban = sc.nextDouble();
		sc.close();
		System.out.printf("%.2f" , pi(ban));
		
	}
	

}
