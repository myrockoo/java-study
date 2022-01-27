import java.util.Scanner;

public class Jungol_561_b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0, min = 10000;
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] < 100)
				max = Math.max(arr[i], max);
			else if (arr[i] > 100)
				min = Math.min(arr[i], min);
		}
		sc.close();
		
		System.out.print((max == 0 ? 100 : max) + " " + (min == 10000 ? 100 : min));

	}

}
