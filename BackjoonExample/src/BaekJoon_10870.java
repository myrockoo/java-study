import java.util.Scanner;

public class BaekJoon_10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(pi(sc.nextInt()));
		sc.close();

	}

	static int pi(int n) {
		if (n > 1)
			n = pi(n - 2) + pi(n - 1);
		return n;
	}
}
