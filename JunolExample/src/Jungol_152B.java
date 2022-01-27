import java.util.Scanner;

public class Jungol_152B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int even = 0, odd = 0;
		
		for(int i = 0; i < arr.length;i++) {
				arr[i] = sc.nextInt();
			if(i % 2 == 0)
				odd += arr[i];
			else
				even += arr[i];
		}
		sc.close();
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);	
	}
}