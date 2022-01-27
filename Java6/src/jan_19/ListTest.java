package jan_19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("List - Select");
		TextField tf = new TextField();
		f.setSize(400, 350);
		f.setLayout(null);

		List selectOne = new List(6);
		selectOne.setLocation(20, 40);
		selectOne.setSize(100, 120);
		selectOne.add("Student");
		selectOne.add("Teacher");
		selectOne.add("Driver");
		selectOne.add("Computer");
		selectOne.add("Man");
		selectOne.add("Music");
		selectOne.add("Direcotr");

		List selectMany = new List(6, true);
		selectMany.setLocation(150, 40);
		selectMany.setSize(100, 120);
		selectMany.add("Student");
		selectMany.add("Teacher");
		selectMany.add("Driver");
		selectMany.add("Computer");
		selectMany.add("Man");
		selectMany.add("Music");
		selectMany.add("Direcotr");

		Button b1 = new Button("실행");
		Button b2 = new Button("실행");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					tf.setText(selectOne.getSelectedItem());

			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText(null);
				for (String s : selectMany.getSelectedItems())
					tf.setText(tf.getText() + s + " ");;

			}
		});
		
		b1.setSize(40,30);
		b2.setSize(40,30);
		b1.setLocation(20, 180);
		b2.setLocation(150, 180);

		tf.setSize(300, 50);
		tf.setLocation(20, 220);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.add(selectOne);
		f.add(selectMany);
		f.add(b1);
		f.add(b2);
		f.add(tf);
		f.setVisible(true);

	}

}
