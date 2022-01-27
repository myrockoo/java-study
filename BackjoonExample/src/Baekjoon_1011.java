import java.util.Scanner;

public class Baekjoon_1011 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			double lenth = Math.abs(y - x);
			int cnt = 0;
			int cnt2 = 0;
			int sum = 0;

			if (lenth == 1) {
				System.out.println(1);
				continue;
			}
			if(lenth == 2) {
				System.out.println(2);
				continue;
			}

			while (lenth / 2 > sum) {
				sum += ++cnt;
				cnt2 = cnt;
			}
			cnt -= 1;
			while (cnt != 1) {
				sum += --cnt;
				cnt2++;
			}

			if (sum == lenth)
				System.out.println(cnt2 + 1);
			else if (sum < lenth)
				System.out.println(cnt2 + 1);

		}
		sc.close();
	}
}
