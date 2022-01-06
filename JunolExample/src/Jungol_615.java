
public class Jungol_615 {
	private String name;
	private int kor;
	private int eng;

	private String name2;
	private int kor2;
	private int eng2;

	public void Jungol_615() {

	}

	public void setAll_1(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void setAll_2(String name, int kor, int eng) {
		this.name2 = name;
		this.kor2 = kor;
		this.eng2 = eng;
	}

	public void print_1() {
		System.out.println(name + " " + kor + " " + eng);
	}

	public void print_2() {
		System.out.println(name2 + " " + kor2 + " " + eng2);
	}

	public void printAvg() {
		System.out.println("avg " + (kor + kor2) / 2 + " " + (eng + eng2) / 2);
	}
}

