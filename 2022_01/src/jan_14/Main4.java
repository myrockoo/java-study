package jan_14;

import java.security.acl.LastOwnerException;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "자바 프로그래밍밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println("location : " + location);
		System.out.println(subject.indexOf("프로그래밍"));
		System.out.println(subject.lastIndexOf("밍"));
		System.out.println(subject.indexOf("밍"));
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련이 있습니다.");
		}else {
			System.out.println("자바와 관련이 없습니다.");
		}

	}

}
