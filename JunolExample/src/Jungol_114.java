import java.util.Scanner;

public class Jungol_114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.println(++num + " " + num2--);
		System.out.println(num + " " + num2);	
	}

}
