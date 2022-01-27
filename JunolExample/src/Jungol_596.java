import java.util.Scanner;

public class Jungol_596 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		sc.close();

		int length = str.length() - 1;

		if (num > length + 1) {
			for (int i = 0; i < str.length(); i++)
			{
				System.out.print(str.charAt(length--));
			}
		} else {

			for (int i = 0; i < num; i++) {
				System.out.print(str.charAt(length--));
			}
		}
	}

}
