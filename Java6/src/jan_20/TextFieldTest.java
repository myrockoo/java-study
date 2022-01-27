package jan_20;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strId = "cjh", strPwd = "8591";
		Frame f = new Frame("Login");
		f.setSize(400, 75);
		f.setLayout(new FlowLayout());
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Button b = new Button("Login");
		b.setSize(50, 50);

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);

		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				if (e.getActionCommand().equals("Login")) {
					if(id.getText().equals(strId) && pwd.getText().equals(strPwd)) {
						System.out.println("로그인 성공");
					}
//				}

			}
		});

		f.add(b);
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.setVisible(true);

	}

}
