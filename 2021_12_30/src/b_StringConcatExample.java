public class b_StringConcatExample {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "JDK";

		String str3 = str1 + str2;
		String str4 = str1 + " " + str2;

//		3.0f = floating��
//						   string   int    double		
		String str5 = "JDK" + (int)3 + 3.0; // ���� ������ ���� 3�� ���ڿ��� �ٲ�� ������ �Ǽ� �ջ��� �ȵ�
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
