import java.util.Scanner;

public class Jungol_560 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int min = 1000;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (min > arr[i])
				min = arr[i];
		}
		sc.close();
		System.out.println(min);
	}

}
