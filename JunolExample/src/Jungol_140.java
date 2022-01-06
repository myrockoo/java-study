import java.util.Scanner;

public class Jungol_140 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0, cnt =0;
		for(int i=0; i < 20; i++) {
			int num = sc.nextInt();
			if(num == 0)
				break;
			sum += num;
			cnt++;			
		}
		sc.close();
		System.out.printf("%d %d", sum, sum / cnt);
	}

}
