package jan_24;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String subject[] = { "����", "����", "����", "����" };
		int score[] = new int[4];
		int sum = 0;
		double avg;

		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		sc.close();
		avg =(double) sum / 4;

		System.out.println("�л� �̸� : " + name);
		for (int i = 0; i < score.length; i++) {
			System.out.println(subject[i] + " ���� : " + score[i]);
		}
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}
}
