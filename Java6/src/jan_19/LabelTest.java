package jan_19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Button b = new Button("test");
		b.setSize(40,40);
		b.setLocation(50,90);
		
		Label id = new Label("ID : ");
		id.setBounds(50,50,30,10);
		
		Label pwd = new Label("Password : ");
		pwd.setBounds(50, 65, 100, 10);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				id.setText("Click!");
				
			}
		});
		
		f.add(b);
		f.add(id);
		f.add(pwd);
		f.setVisible(true);

	}

}
