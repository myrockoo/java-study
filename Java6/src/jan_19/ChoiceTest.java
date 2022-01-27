package jan_19;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest extends WindowAdapter implements ActionListener {
	private Button b;
	private Frame f;
	private Choice day;

	
	public ChoiceTest() {
		b = new Button("요일 선택");
		f = new Frame("Choice - Select");
		day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");

	}
	
	public void start() {
		f.addWindowListener(this);
		b.addActionListener(this);
		f.setSize(300,200);
		f.setLayout(null);
		
		b.setSize(50, 50);
		b.setLocation(150,120);
		day.setSize(100,50);
		day.setLocation(100,70);
		
		f.add(b);
		f.add(day);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		b.setLabel(day.getSelectedItem());
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChoiceTest ct = new ChoiceTest();
		ct.start();

	}

}
