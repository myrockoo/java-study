import java.util.Scanner;

public class Jungol_195 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Info in = new Info(sc.next(), sc.next(), sc.next());
		sc.close();
		
		in.print();

	}
}

class Info{
	private String name;
	private String tel;
	private String addr;
	
	public Info(String name, String tel, String addr) {
	this.name = name;
	this.tel = tel;
	this.addr = addr;
	}
	
	public void print () {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}
	
}

