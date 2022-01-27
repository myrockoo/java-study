package jan_18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class FlowTest {
	private Frame frame;
	private Button button1, button2, button3;
	TextField button4,button5,button6;
	
	public FlowTest() {
		frame = new Frame("FlowLayout example");
		button1 = new Button("확인");
		button2 = new Button("열기");
		button3 = new Button("닫기");
		button4 = new TextField("테스트");
		button5 = new TextField("테스트");
		button6 = new TextField("테스트");


	}
	
	public void startFrame() {
//		frame.add(button4, "West");
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6, BorderLayout.SOUTH); // 안되네
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowTest flow = new FlowTest();
		flow.startFrame();

	}

}
