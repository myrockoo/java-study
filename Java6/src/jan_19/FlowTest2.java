package jan_19;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowTest2 extends WindowAdapter {
	private Frame f;
	private Button b1, b2, b3;

	public FlowTest2() {
		f = new Frame("adapter example");
		b1 = new Button("Button1");
		b2 = new Button("Button2");
		b3 = new Button("Button3");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void StartFrame() {
		f.addWindowListener(this);
		f.setLayout(new FlowLayout());
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setSize(400,400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowTest g = new FlowTest();
		g.startFrame();

	}

}
