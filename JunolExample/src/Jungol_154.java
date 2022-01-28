import java.util.Scanner;

public class Jungol_154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n = 0;
		
		for(int i = 0; i < 6; i++) {
			n += sc.nextDouble();
		}
		sc.close();
		System.out.printf("%.1f", n / 6);
	}
}
