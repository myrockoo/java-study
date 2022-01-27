import java.util.Scanner;

public class Jungol_616b {

	public static void main(String[] args) {
		Triangle tri = new Triangle();
		Scanner sc = new Scanner(System.in);

		tri.setPosition_1(sc.nextInt(), sc.nextInt());
		tri.setPosition_2(sc.nextInt(), sc.nextInt());
		tri.setPosition_3(sc.nextInt(), sc.nextInt());
		sc.close();

		tri.print_TCG();
	}
}

class Triangle {
	private int x1, x2, x3;
	private int y1, y2, y3;

	public Triangle() {
	}

	public void setPosition_1(int x, int y) {
		this.x1 = x;
		this.y1 = y;
	}

	public void setPosition_2(int x, int y) {
		this.x2 = x;
		this.y2 = y;
	}

	public void setPosition_3(int x, int y) {
		this.x3 = x;
		this.y3 = y;
	}

	public void print_TCG() {
		System.out.printf("(%.1f, %.1f)", (x1 + x2 + x3) / 3.0, (y1 + y2 + y3) / 3.0);
	}

}
