import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ��Ʈ�� + ����Ʈ + o = �ڵ����� ���ȣ��(import)

		int a = sc.nextInt();
		sc.close();

		System.out.println(a);
	}

}
