import java.util.Scanner;

public class Jungol_128 {

	public static void main(String[] args) {
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			int num = sc.nextInt();
			if(num == 0)
				break;
			else if (num % 3 == 0 || num % 5 == 0)
				continue;
			cnt++;
		}
		sc.close();
		System.out.println(cnt);
	}

}
