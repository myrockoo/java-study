package jan_20;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CanvasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Canvas Test");
		f.setSize(300,200);
//		f.setLayout(new FlowLayout());
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		ScrollPane sp = new ScrollPane();
//		sp.getBounds(ScrollPane.RIGHT_ALIGNMENT);
		Panel p = new Panel();
		p.setBackground(Color.cyan);
		p.add(new Button("1st"));
		p.add(new Button("2nd"));
		p.add(new Button("3rd"));
		p.add(new Button("4th"));
		
		sp.add(p);
		
		
		Canvas c = new Canvas();
		c.setBackground(Color.pink);
		c.setBounds(50, 50, 150, 100);
		
		f.add(sp);
//		f.add(c);
		f.setVisible(true);

	}

}
