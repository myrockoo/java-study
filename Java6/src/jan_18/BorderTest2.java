package jan_18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BorderTest2 {

	private Frame frame;
	private Button center, west;
	private TextField tf1;
	
	public BorderTest2() {
		frame = new Frame("BorderLayout Example2");
		west = new Button("button 1");
		center = new Button("button 4");
		tf1 = new TextField();
		tf1.setText("�Է�â �Դϴ�.");
	}
	
	public void startFrame() {
		frame.add(tf1, "North");
		frame.add(west, "West");
		frame.add(center, "Center");
		
		frame.setSize(400,400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderTest2 border = new BorderTest2();
		border.startFrame();

	}

}
