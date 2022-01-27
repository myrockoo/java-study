import java.util.Scanner;

public class Jungol_151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i= 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(arr[0] +arr[2] + arr[4]);

	}

}
