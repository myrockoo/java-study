import java.util.Scanner;

public class Jungol_131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double num2 = sc.nextDouble();
		sc.close();
		
		double diff = num - num2;
		if (diff < 0)
			diff *= -1;
		for (double i = (((num + num2)/ 2) - (diff / 2)); i <= ((num + num2)/2 +(diff/2)); i++)
			System.out.print((int)i + " ");

	}

}
