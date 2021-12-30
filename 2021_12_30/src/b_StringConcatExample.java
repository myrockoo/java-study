public class b_StringConcatExample {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "JDK";

		String str3 = str1 + str2;
		String str4 = str1 + " " + str2;

//		3.0f = floating형
//						   string   int    double		
		String str5 = "JDK" + (int)3 + 3.0; // 연산 순서에 따라 3이 문자열로 바뀌어 정수와 실수 합산이 안됨
		String str6 = (char)3 + 3.0 + "JDK";
//		3.0f * 3
//		

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}
}
