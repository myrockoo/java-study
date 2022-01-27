import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int arr[] = new int[10000];
		int cnt = 0;

		for (int i = 0; i < num; i++) {
			String command = bf.readLine();
			if (command.indexOf("push") != -1) {
				arr[++cnt] = Integer.parseInt(command.substring(5));
			} else if (command.equals("pop")) {
				if (arr[cnt] == '\0')
					System.out.println(-1);
				else
					System.out.println(arr[cnt--]);
			} else if (command.equals("size")) {
				System.out.println(cnt);
			} else if (command.equals("empty")) {
				System.out.println(arr[cnt] == '\0' ? 1 : 0);
			} else if (command.equals("top")) {
				System.out.println(arr[cnt] != '\0' ? arr[cnt] : -1);
			}

		}
		bf.close();

	}

}
