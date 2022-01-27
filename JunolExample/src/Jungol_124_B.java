import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jungol_124_B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int month = Integer.parseInt(br.readLine());
		br.close();
		if (month > 0 && month < 13) {
			switch (month) {
			case 2:
				System.out.println(28);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(30);
				break;
			default:
				System.out.println(31);

			}
		}
	}

}
