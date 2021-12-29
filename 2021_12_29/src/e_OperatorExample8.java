public class e_OperatorExample8 {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char) (c2 + 1); //산출 타입 : int
//		char c4 = (c2 + 1);  자바에서는 객체지향으로 자동으로 int로 변환시켜서 그럼 
		int i3 = c2 + 1;
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("i3 : " + i3);
	}

}
