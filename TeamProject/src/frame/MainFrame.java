package frame;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(500, 500);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		MenuBar mb = new MenuBar();
		
		Menu m1 = new Menu("m1");
		
		MenuItem login = new MenuItem("Login");
		
//		login.addActionListener(new WindowAdapter() {
//			
//		});
		
		Menu m2 = new Menu("m2");
		Menu m3 = new Menu("m3");
		
		m1.add(login);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		f.setMenuBar(mb);
		f.setVisible(true);
	}

}
