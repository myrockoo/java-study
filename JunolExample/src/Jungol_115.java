import java.util.Scanner;

public class Jungol_115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height1 = sc.nextInt();
		int weight1 = sc.nextInt();
		int height2 = sc.nextInt();
		int weight2 = sc.nextInt();
		sc.close();

		System.out.println(height1 > height2 && weight1 > weight2 ? 1 : 0);
	}

}
