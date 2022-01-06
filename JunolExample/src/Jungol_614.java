import java.util.Scanner;

public class Jungol_614 {
	private String school = "Jejuelementary";
	private int grade = 6;
	
	public static void main(String args[]) {
		Jungol_614 id = new Jungol_614();
		id.print();
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int grade = sc.nextInt();
		sc.close();
		id.setSchool(name);
		id.setGrade(grade);
		id.print();
	}
	
//	public void Jungol_614(){
//		
//	}
	public void setSchool(String str) {
		this.school = str;
	}
	public void setGrade(int n) {
		this.grade = n;
	}
	public void print() {
		System.out.println(grade + " grade in " + school + " School");
		}	
}