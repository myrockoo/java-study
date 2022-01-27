import java.util.Scanner;

public class Jungol_562_b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < arr.length; i += 2) {
			avg += arr[i];
		}
		for (int i = 1; i < arr.length; i += 2) {
			sum += arr[i];
		}
		avg /= 5;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);

	}

}
