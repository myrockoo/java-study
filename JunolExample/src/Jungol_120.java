import java.util.Scanner;

public class Jungol_120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [2];
		
		for (int i =0; i < 2; i++)
			arr[i] = sc.nextInt();
		sc.close();
		
		int tmp = arr[0];
		
		for (int i = 0; i < arr.length - 1; i++)
		{
			if (tmp < arr[i + 1])
				tmp = arr[i + 1];
		}
		System.out.println(arr[0] > arr [1] ? arr[0] - arr[1] : arr[1] - arr[0]);
					
	}

}
