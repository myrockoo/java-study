import java.util.Scanner;

public class Backjoon_2440 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int star = num;
		
		for (int i = 0; i < num; i++)
		{
			for (int j = star; j > 0; j--)
				System.out.print("*");
			System.out.print("\n");
			star--;
		}
	}

}
