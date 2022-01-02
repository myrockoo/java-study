import java.util.Scanner;

public class Backjoon_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		int sum = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') && str.charAt(i + 1) == ' ')
				sum += 1;
			else if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') && str.charAt(i + 1) == ' ')
				sum += 1;
		}
		if (str.charAt(str.length() - 1) == ' ')
			sum -=  1;
		System.out.println(sum + 1);

	}

}
