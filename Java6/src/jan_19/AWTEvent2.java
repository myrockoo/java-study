package jan_19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTEvent2 {
	private Frame frame;
	private Button btn1, btn2, btn3, btn4, btn5;

	public AWTEvent2() {
		frame = new Frame("event handler example");
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn3 = new Button("Button3");
		btn4 = new Button("Button4");
		btn5 = new Button("Button5");
	}

	public void StartFrame() {
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				System.out.println("Button1 Click");
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				System.out.println("Button2 Click");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				System.out.println("Button3 Click");
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				System.out.println("Button4 Click");
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				System.out.println("Button5 Click");
			}
		});
		
		frame.add(btn1, BorderLayout.NORTH);
		frame.add(btn2, BorderLayout.SOUTH);
		frame.add(btn3, BorderLayout.WEST);
		frame.add(btn4, BorderLayout.EAST);
		frame.add(btn5, BorderLayout.CENTER);
		
		frame.setSize(400,400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		AWTEvent2 at = new AWTEvent2();
		at.StartFrame();
		// TODO Auto-generated method stub

	}

}
