import java.util.Scanner;

public class Backjoon_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();

		for (int i = 0; i < testcase; i++) {
			int sum = 0, avg = 0, k = 0;
			int person = sc.nextInt();
			int arr[] =new int[person];
			for (int j = 0; j < person; j++) {
				int grade = sc.nextInt();
				arr[k] = grade;
				sum += grade;
				k++;
			}
			avg = sum / person;
			
			int compare = 0;
			
			for (int k1 = 0; k1 < person; k1++)
			{
				if(arr[k1] > avg)
					compare += 1;
			}
			System.out.printf("%.3f%%\n", ((double) compare / (double)person) * 100);
		}
		sc.close();
	}

}
