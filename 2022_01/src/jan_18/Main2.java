package jan_18;

import java.text.MessageFormat;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "java";
		String name = "ȫ�浿";
		String tel = "010-123-4567";
		
		String text = "ȸ�� ID: {0} \nȸ�� �̸�: {1} \nȸ�� ��ȭ: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values({0}, {1}, {2})";
		Object[] arguments = {"java", "ȫ�浿", "010-123-4567"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);

	}

}