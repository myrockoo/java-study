import java.util.Scanner;

public class Jungol_150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[10];
		
		for(int i= 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}
		sc.close();
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
