package jan_18;

import java.util.Random;
import java.util.Scanner;

public class MiniProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random(System.currentTimeMillis());
		int[] goal = new int[3];
		int[] num = new int[3];
		int strike, ball;

		//난수 생성
		while (goal[0] == goal[1] || goal[1] == goal[2] || goal[0] == goal[2]) {
			for (int i = 0; i < goal.length; i++) {
				goal[i] = random.nextInt(9) + 1;
			}
		}

		//사용자 입력 및 비교 반복 출력
		while (true) {
			strike = 0;
			ball = 0;
			System.out.println("Input number...");
			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
				for (int j = 0; j < num.length; j++) {
					if (num[i] == goal[i]) {
						strike++;
						break;
					} else if (num[i] == goal[j]) {
						ball++;
						break;
					}
				}
			}
			System.out.println("strike : " + strike + ", ball : " + ball);
			if (strike == 3)
				break;
		}
		sc.close();
		System.out.println("Game Over!!");
	}

}
