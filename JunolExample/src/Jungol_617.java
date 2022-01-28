import java.util.Scanner;

public class Jungol_617 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Profile arr[] = new Profile[5];
		int min = Integer.MAX_VALUE;
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Profile(sc.next(), sc.nextInt());
			min = Math.min(min, arr[i].getHeight());
			if (min == arr[i].getHeight()) {
				cnt = i;
			}
		}
		sc.close();
		arr[cnt].print();
	}
}

class Profile {
	private String name;
	private int height;

	public Profile(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public void set(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public int getHeight() {
		return this.height;
	}

	public String getName() {
		return this.name;
	}

	public void print() {
		System.out.println(this.name + " " + this.height);
	}
}
