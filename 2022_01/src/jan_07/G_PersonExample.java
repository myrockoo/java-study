package jan_07;

public class G_PersonExample {

	public static void main(String[] args) {
		F_Person p1 = new F_Person("123456-1234567", "kyeBaek");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println(F_Person.nation);
		
//		p1.nation = "USA";
//		The final field cannot be assigned.
//		p1.ssn = "654321 - 7654321";
		p1.name = "LeeSoonSin";
	}

}
