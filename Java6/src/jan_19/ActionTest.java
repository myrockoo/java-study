package jan_19;

import java.awt.Button;
import java.awt.Frame;

public class ActionTest {
	private Frame f;
	private Button bt1, bt2, bt3, bt4, bt5;

	public ActionTest() {
		f = new Frame("event handler example2");
		bt1 = new Button("Button1");
		bt2 = new Button("Button2");
		bt3 = new Button("Button3");
		bt4 = new Button("Button4");
		bt5 = new Button("Button5");
	}

	public void startFrame() {
		bt1.addActionListener(new ActionHandler());
		bt2.addActionListener(new ActionHandler());
		bt3.addActionListener(new ActionHandler());
		bt4.addActionListener(new ActionHandler());
		bt5.addActionListener(new ActionHandler());

		f.add(bt1, "North");
		f.add(bt2, "South");
		f.add(bt3, "West");
		f.add(bt4, "East");
		f.add(bt5, "Center");

		f.setSize(400, 400);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionTest at = new ActionTest();
		at.startFrame();
	}

}
