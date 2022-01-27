package jan_14;

import java.util.Scanner;

public class jungol {
	private String name;
	private int kor;
	private int eng;
	private int sumKor;
	private int sumEng;
	private int cnt;

	public jungol() {

	}

	public void setId(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		sumKor += kor;
		sumEng += eng;
		cnt++;
	}

	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}

	public void printAvg() {
		System.out.print("avg " + sumKor / cnt + " " + sumEng / cnt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jungol id = new jungol();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			id.setId(sc.next(), sc.nextInt(), sc.nextInt());
			id.print();
		}
		sc.close();
		id.printAvg();

	}

}

