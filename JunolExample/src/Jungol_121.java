import java.util.Scanner;

public class Jungol_121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if (num == 0)
			System.out.println("zero");
		else if (num < 0)
			System.out.println("minus");
		else
			System.out.println("plus");
	}

}
