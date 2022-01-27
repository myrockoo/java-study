package jan_20;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("parent");
		f.setSize(300, 200);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Dialog info = new Dialog(f, "Information", true);
		info.setSize(140, 90);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());

		info.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				info.dispose();
			}
		});

		Label msg = new Label("This is modal Dialog", Label.CENTER);
		Button ok = new Button("OK");
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				info.dispose();
			}
		});
		info.add(msg);
		info.add(ok);

		f.setVisible(true);
		info.setVisible(true);

	}

}
