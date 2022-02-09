import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentId si = new StudentId("Jejuelementary",6);
		si.print();

		StudentId si2 = new StudentId(sc.next(), sc.nextInt());
		sc.close();
		
		si2.print();		
	}
}

class StudentId {
	private String school;
	private int grade;

	public StudentId(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(grade + " grade in " + school +" school");
	}
}