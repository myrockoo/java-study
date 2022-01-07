import java.util.Scanner;

public class test {
	String name;
	String school;
	int grade;
	
	public test(String n, String s, int g) {
		this.school = s;
		this.grade = g;
		this.name = n;		
	}
	public void print() {
		System.out.println("Name : " + this.name);
		System.out.println("School : " + this.school);
		System.out.println("Grade : " + this.grade);
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test id = new test(sc.next(), sc.next(), sc.nextInt());
		sc.close();
		id.print();

	}
}