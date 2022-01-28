import java.util.Scanner;

public class Baekjoon_10872 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(fac(sc.nextInt()));
		sc.close();
	}

	static int fac(int n) {
		if (n > 1)
			n *= fac(n - 1);
		else if (n == 0)
			n = 1;
		return n;
	}
}
