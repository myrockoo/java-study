
public class Animal {
	private String name;
	private int age;

	public void setName(String pname) {
		name = pname;
	}

	public String getName() {
		return name;
	}

	public void setAge(int page) {
		if (page <= 0) {
			System.out.println("Input error");
		} else {
			age = page;
		}
	}

	public int getAge() {
		return age;
	}
}
