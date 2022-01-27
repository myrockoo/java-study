import java.util.Scanner;

public class Jungol_593 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		
		int num;		
		while(true) {
			System.out.print("ASCII code =? ");
			num = sc.nextInt();			
			if(num < 33 || num > 127)
				break;
			System.out.println(Character.toString(num));
		}
		sc.close();
	}
}
