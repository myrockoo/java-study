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
		button1 = new Button("Ȯ��");
		button2 = new Button("����");
		button3 = new Button("�ݱ�");
		button4 = new TextField("�׽�Ʈ");
		button5 = new TextField("�׽�Ʈ");
		button6 = new TextField("�׽�Ʈ");


	}
	
	public void startFrame() {
//		frame.add(button4, "West");
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6, BorderLayout.SOUTH); // �ȵǳ�
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowTest flow = new FlowTest();
		flow.startFrame();

	}

}
