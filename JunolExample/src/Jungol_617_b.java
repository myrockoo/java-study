//import java.util.Scanner;
//
//public class Jungol_617_b {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Profile arr[] = new Profile[5];
//		Profile min = new Profile("none", Integer.MAX_VALUE);
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = new Profile(sc.next(), sc.nextInt());
//			if(arr[i].getHeight() < min.getHeight())
//				min = arr[i];
//		}
//		sc.close();
//		min.print();
//	}
//}
//
//class Profile {
//	private String name;
//	private int height;
//
//	public Profile(String name, int height) {
//		this.name = name;
//		this.height = height;
//	}
//
//	public void set(String name, int height) {
//		this.name = name;
//		this.height = height;
//	}
//
//	public int getHeight() {
//		return this.height;
//	}
//
//	public String getName() {
//		return this.name;
//	}
//
//	public void print() {
//		System.out.println(this.name + " " + this.height);
//	}
//}
