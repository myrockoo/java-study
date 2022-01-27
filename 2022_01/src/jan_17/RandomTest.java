package jan_17;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		rn.setSeed(System.currentTimeMillis());
		
		String[] str = new String[5];
		
		int[] score = {95,70,80,30};
		
		for(int i = 0; i < 3; i++) {
			System.out.print(score[i] + str[i]);
		}
		
		for(int i = 0; i < 10; i++) {
			double a = rn.nextDouble();
			System.out.printf("%.3f\n", a * 100);
		}

	}

}
