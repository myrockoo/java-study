import java.util.Scanner;

public class Backjoon_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if (num < 100)
			System.out.println(num);
		else
			System.out.println(d(num));

	}

	static int d(int n) {
		int cnt = 99;
		for(int i = 99; i <= n; i++) {
			int j = i / 100; //100의 자리
			int k = (i / 10) % 10; // 10의 자리
			int p =  ((i % 10) % 10); //  1의 자리
			if (j - k == k - p)
				cnt++;
		}

		return (cnt);
	}

}
