import java.util.Scanner;

public class Jungol_557 {

	public static void main(String[] args) {
		String arr[] = new String[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
			if (i == 0 || i == 3 || i == 6)
				System.out.print(arr[i].charAt(0) + " ");
		}
		sc.close();
	}

}
