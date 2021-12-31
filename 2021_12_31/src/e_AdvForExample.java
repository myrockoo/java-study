import java.util.Scanner;

public class e_AdvForExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();
		int scores[] = new int[event];
		for (int i=0; i < scores.length; i++)
			scores[i] = sc.nextInt();
		sc.close();		
		
		int sum = 0;
		for (int s : scores) {
			sum += s;
		}
		System.out.println("sum : " + sum);
	}

}
