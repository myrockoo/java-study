//import java.util.Scanner;
//
//public class Jungol_616_c {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Triangle tr = new Triangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//		sc.close();
//		tr.getCOG();
//
//	}
//
//}
//
//class Triangle {
//	private Point a, b, c;
//
//	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
//		this.a = new Point(x1, y1);
//		this.b = new Point(x2, y2);
//		this.c = new Point(x3, y3);
//
//	}
//
//	public void getCOG() {
//		System.out.printf("(%.1f, %.1f)", (a.getx() + b.getx() + c.getx()) / 3,
//				(a.gety() + b.gety() + c.gety()) / 3);
//	}
//
//}
//
//class Point {
//	private double x;
//	private double y;
//
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	public double getx() {
//		return x;
//	}
//
//	public double gety() {
//		return y;
//	}
//
//}
