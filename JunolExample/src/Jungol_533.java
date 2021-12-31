import java.util.Scanner;

public class Jungol_533 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char sex = str.charAt(0);
//		char sex = sc.next().charAt(0);
		String str2 = sc.next();
		sc.close();

		char tmp;
		boolean output = true;
		int age = 0;

		String str3 = str2.replaceAll("[^0-9]", "");
//		tmp = str3.charAt(0);

//		for (int i = 0; i < str3.length(); i++) {
//			tmp = str3.charAt(i);
//			if (Character.isDigit(tmp) == false)
//				output = false;
//		}
				
		if (str3.length() != 0) {
			age = Integer.parseInt(str3);

			if (age >= 18) {
				switch (sex) {
				case 'M':
					System.out.println("MAN");
					break;
				case 'F':
					System.out.println("WOMAN");
					break;
				default:
					System.out.println("올바른 성별을 입력해 주세요");
				}
			} else if (age < 18 && age > 0) {
				switch (sex) {
				case 'M':
					System.out.println("BOY");
					break;
				case 'F':
					System.out.println("GIRL");
					break;
				default:
					System.out.println("올바른 성별을 입력해 주세요");
				}
			}
		} else
			System.out.println("바른 값을 입력해 주세요");
	}
}
