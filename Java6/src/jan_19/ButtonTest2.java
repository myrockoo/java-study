package jan_19;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest2 extends WindowAdapter implements ActionListener{
	private Button b;
	private Frame f;
	
	public ButtonTest2(String f, String b) {
		this.f = new Frame(f);
		this.b = new Button(b);		
	}
	
	public void windowClosiong(WindowEvent e) {
		System.exit(0);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("확인")) {
			b.setLabel("취소");
		}
		if(e.getActionCommand().equals("취소")) {
			b.setLabel("확인");
		}
	}
	
	public void startTest() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		
		b.addActionListener(this);
		b.setBackground(Color.red);
		b.setSize(100,100);
		f.setBackground(Color.black);
		f.add(b);
		f.setSize(400,400);
		b.setLocation(screenSize.width/2 - 50, screenSize.height/2 - 50);
		f.setLayout(null);
		f.setVisible(true);
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonTest2 bt = new ButtonTest2("버튼 테스트", "확인");
		bt.startTest();

	}

}
