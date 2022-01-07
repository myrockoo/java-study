import java.util.Scanner;

public class Jungol_141 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for (int i = 1; num * i < 100; i++) {
			System.out.print(num * i +" ");
			if (i*num % 10 == 0)
				break;
		}
	}

}
