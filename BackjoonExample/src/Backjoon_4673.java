
public class Backjoon_4673 {

	public static void main(String[] args) {
		int arr[] = new int[10001];
		for (int i = 1; i <= 10000; i++) {
			int sel = self(i);
			
			if  (sel <= 10000)
				arr[sel] = 1;
		}
		for (int i = 1; i <= 10000; i++) {
			if(arr[i] == 0)
				System.out.println(i);
		}
	}

	public static int self(int n) {
		int ans = n;
		while (true) {
			if (n == 0)
				break;
			ans += n %10;
			n /= 10;
		}
		return (ans);
	}

}
