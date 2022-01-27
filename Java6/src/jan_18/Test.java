package jan_18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	private Frame f;
	private Panel p;
	private Button b;
	private TextField tf;
	private int n = 3;
	private String str = "Å×½ºÆ®";
	
	public Test() {
		f = new Frame("test");
		p = new Panel();
		b = new Button("button");
	}
	
	public void startTest() {
		tf = new TextField(str);
		p.setBackground(Color.black);
//		f.add(b,BorderLayout.NORTH);
		f.add(b,BorderLayout.NORTH);
		b.setBackground(Color.red);
		tf.setBackground(Color.yellow);
		f.setBackground(Color.white);
		f.add(p, BorderLayout.CENTER);
//		p.add(tf, "WEST");
		p.add(tf, "Center");
		
		f.setSize(400,400);
		f.setVisible(true);		
	}
	
	public void setTest(int n) {
		this.n = n;
	}
	
	public void setStr(String str){
		this.str = str;	
	}
	
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		br.close();
		
		Test t = new Test();
		t.setStr(str);
		t.startTest();
		
	}

}
