package jan_17;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int[] scores = new int[4];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		sc.close();
		avg = sum / scores.length;	
		
		System.out.println("name : " + name);
		System.out.println("kor : " + scores[0]);
		System.out.println("eng : " + scores[1]);
		System.out.println("mat : " + scores[2]);
		System.out.println("sci : " + scores[3]);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);

	}

}
