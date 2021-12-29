import java.util.Scanner;

public class Jungol_521 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	sc.close();
	
	int mul = num1++ * --num2;
		
	System.out.printf("%d %d %d", num1, num2, mul);
	}

}
