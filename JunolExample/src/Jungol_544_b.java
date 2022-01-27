import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jungol_544_b {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		bf.close();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
