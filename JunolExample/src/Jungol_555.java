import java.util.Scanner;

public class Jungol_555 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
			System.out.print(arr[i].charAt(0));
		}
		sc.close();
	}
}
