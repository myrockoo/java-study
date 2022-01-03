import java.util.Scanner;

public class Jungol_563 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			int sel = arr[i];
			int swap = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (sel < arr[j]) {
					swap = sel;
					sel = arr[j];
					arr[j] = swap;
				}
			}
			System.out.print(sel + " ");
		}
	}
}
