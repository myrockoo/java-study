import java.util.Scanner;

public class Jungol_535 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		sc.close();
		
		if (score >= 0 && score <= 4.5) {
			switch ((int)score) {
			case 4:
				System.out.println("scholarship");
				break;
			case 3:
				System.out.println("next semester");
				break;
			case 2:
				System.out.println("seasonal semester");
				break;
				default :
					System.out.println("retake");
			}
		}
	}

}
