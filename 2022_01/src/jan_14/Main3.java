package jan_14;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "123456-1234567";
		char p = ssn.charAt(7);

		switch (p) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}

	}

}
