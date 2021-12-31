import java.util.Scanner;

public class Backjoon_1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int sum = 1, cnt = 0, line = 1;
		
		while (true)
		{
			sum++;
			cnt += line;
			if (cnt >= num)
				break;
			line++;
		}
		
		
		System.out.println(line);
	}

}
