import java.util.Scanner;

public class Jungol_573 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		print(sc.nextInt());
		sc.close();
	}
	
	static void print(int n){
		for(int i = 1; i <= n*n; i++) {
			System.out.print(i + " ");
			if(i % n == 0)
				System.out.println();
		}
	}

}
