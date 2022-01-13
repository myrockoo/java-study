import java.util.Scanner;

public class Jungol_149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int cnt = 1;
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(cnt > 10)
					cnt /= 10;
				System.out.print(cnt + " ");
				cnt += 2;
			}
			System.out.println();
		}		

	}

}
