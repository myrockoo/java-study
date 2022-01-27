import java.util.Scanner;

public class Jungol_585b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] > arr[j - 1]) {
					swap(arr,j, j - 1);
				}
			}
			for (int s : arr) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
	private static void swap(int[] arr, int j, int i) {
		// TODO Auto-generated method stub
		int c = arr[j];
		arr[j] = arr[j - 1];
		arr[j - 1] = c;		
	}
}
