import java.util.Scanner;

public class Jungol_585 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		int c = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] > arr[j - 1]) {
					c = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = c;
				}
			}
			for (int s : arr) {
				System.out.print(s + " ");
			}
			newLine();
		}
	}

	static void newLine() {
		System.out.println();
	}

}
