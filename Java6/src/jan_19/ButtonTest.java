package jan_19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest extends WindowAdapter implements ActionListener {
	private Button b;
	private Frame f;

	public ButtonTest(String str) {
		f = new Frame("Test");
		b = new Button(str);
	}

	public void startTest() {
		b.addActionListener(this);
		b.setSize(200, 200);
		
		f.addWindowListener(this);
		f.add(b);
		f.setSize(400,400);
		f.setVisible(true);

	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Ȯ��")) {
			b.setLabel("���");
		}
		if (e.getActionCommand().equals("���")) {
			b.setLabel("Ȯ��");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonTest bt = new ButtonTest("Ȯ��");
		bt.startTest();

	}

}
