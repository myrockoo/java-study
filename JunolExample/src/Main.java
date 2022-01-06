import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Jungol_615 grade = new Jungol_615();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			if (i == 0) {
				grade.setAll_1(name, kor, eng);
				grade.print_1();
			} else {
				grade.setAll_2(name, kor, eng);
				grade.print_2();
			}
		}
		sc.close();
		grade.printAvg();
	}
}
