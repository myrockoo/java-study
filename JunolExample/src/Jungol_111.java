import java.util.Scanner;

public class Jungol_111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int cou =sc.nextInt();
		sc.close();
		
		System.out.println("sum " + (kor + eng +mat + cou));
		System.out.println("avg " + (kor + eng + mat + cou) / 4);
	}
}
