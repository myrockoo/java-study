import java.util.Scanner;

public class Baekjoon_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int repeat = sc.nextInt();
			String str = sc.next();
			for(int j = 0; j < str.length(); j++)
			{
				for(int k = 0; k < repeat; k ++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.print("\n");
		}
		sc.close();

	}

}
