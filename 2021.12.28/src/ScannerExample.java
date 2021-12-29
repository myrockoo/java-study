import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 컨트롤 + 쉬프트 + o = 자동으로 기능호출(import)

		int a = sc.nextInt();
		sc.close();

		System.out.println(a);
	}

}
