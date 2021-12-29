import java.util.Scanner;

public class Jungol_110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("yard? ");
		
		double yard = sc.nextDouble();
		sc.close();
		
		System.out.printf("%.1fyard = %.1fcm", yard, yard * 91.44);				
	}

}
