import java.util.Scanner;

public class Jungol_562 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int odd = 0, even = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if ((i + 1) % 2 == 0)
				odd += arr[i];
			else
				even += arr[i];
		}
		sc.close();
		System.out.println("sum : " + odd);
		System.out.printf("avg : %.1f", (double) even / 5);

	}

}
