import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jungol_152 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[11];
		int even = 0, odd = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (i % 2 == 0)
				odd += arr[i];
			else
				even += arr[i];
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
