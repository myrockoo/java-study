import java.util.Scanner;

class IdCard {
	private String name;
	private String school;
	private int grade;

	public IdCard (String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}

	public void getIdCard() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);

	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();

		IdCard id = new IdCard(name, school, grade);
		id.getIdCard();
	}
}