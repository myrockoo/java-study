import java.util.Scanner;

public class Jungol_558 {

	public static void main(String[] args) {
		int cnt = 0;
		int arr[] = new int [100];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == 0) {
				cnt = i;
				sc.close();
				break;
			}
		}
		for (int i = cnt - 1; i >= 0; i--)
			System.out.print(arr[i] + " ");
		}
	}
