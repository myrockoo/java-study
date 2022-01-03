import java.util.Scanner;

public class Jungol_561 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int max = 1, min = 10000;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] >= 100 && arr[i] < min)
				min = arr[i];
			else if (arr[i] < 100 && arr[i] > max)
				max = arr[i];
		}
		sc.close();
		if (max == 1)
			max = 100;
		if (min == 10000)
			min = 100;
		System.out.print(max + " " + min);
	}

}
