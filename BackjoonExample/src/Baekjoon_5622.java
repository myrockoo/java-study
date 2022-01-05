import java.util.Scanner;

public class Baekjoon_5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dial = sc.next();
		sc.close();
		
		int second = 0;
		for (int i = 0; i < dial.length(); i++) {
			if (dial.charAt(i) >= 'A' && dial.charAt(i) <= 'C')
				second += 3;
			else if (dial.charAt(i) >= 'D' && dial.charAt(i) <= 'F')
				second += 4;
			else if (dial.charAt(i) >= 'G' && dial.charAt(i) <= 'I')
				second += 5;
			else if (dial.charAt(i) >= 'J' && dial.charAt(i) <= 'L')
				second += 6;
			else if (dial.charAt(i) >= 'M' && dial.charAt(i) <= 'O')
				second += 7;
			else if (dial.charAt(i) >= 'P' && dial.charAt(i) <= 'S')
				second += 8;
			else if (dial.charAt(i) >= 'T' && dial.charAt(i) <= 'V')
				second += 9;
			else if (dial.charAt(i) >= 'W' && dial.charAt(i) <= 'Z')
				second += 10;
//			else if (dial.charAt(i) >= 'M' && dial.charAt(i) <= 'O')
//				second += 3;
			
		}
		System.out.println(second);
				
	}

}
