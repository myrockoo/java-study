import java.util.Scanner;

public class Baekjoon_9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SStack stk = new SStack();
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			String inp = sc.next();
			boolean res = true;
			stk.init();
			
			for(int j = 0; j < inp.length(); j++) {
				if(inp.charAt(j) == '(') {
					stk.push('(');
				}else {
					if(stk.isempty()) {
						res = false;
					}else {
						stk.pop();
					}
				}
			}
			if(res == true && stk.isempty()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		sc.close();		
	}
}
class SStack{
	private char ar[];
	private int top;
	
	public SStack() {
		ar = new char[50];
		top = -1;		
	}
	
	public void push(char c) {
		ar[++top] = c;
		
	}
	
	public void pop() {
		top--;
	}
	
	public boolean isempty() {
		if(top == - 1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void init() {
		top = -1;
	}
}
