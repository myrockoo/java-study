package jan_14;

import java.security.acl.LastOwnerException;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "�ڹ� ���α׷��ֹ�";
		
		int location = subject.indexOf("���α׷���");
		System.out.println("location : " + location);
		System.out.println(subject.indexOf("���α׷���"));
		System.out.println(subject.lastIndexOf("��"));
		System.out.println(subject.indexOf("��"));
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ������ �ֽ��ϴ�.");
		}else {
			System.out.println("�ڹٿ� ������ �����ϴ�.");
		}

	}

}
