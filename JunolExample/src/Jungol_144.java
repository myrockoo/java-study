import java.util.Scanner;

public class Jungol_144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < num; i++) {
			for(int j = (num - i)*2 -2; j > 0; j--)
				System.out.print(" ");
			for(int j = 0; j < 2*i +1; j++)
				System.out.print("*");
			System.out.println();			
		}
	}

}
