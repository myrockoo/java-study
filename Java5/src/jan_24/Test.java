package jan_24;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String subject[] = { "국어", "영어", "수학", "과학" };
		int score[] = new int[4];
		int sum = 0;
		double avg;

		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		sc.close();
		avg =(double) sum / 4;

		System.out.println("학생 이름 : " + name);
		for (int i = 0; i < score.length; i++) {
			System.out.println(subject[i] + " 점수 : " + score[i]);
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
