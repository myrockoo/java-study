package jan_19;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Login");
		f.setSize(300,200);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		f.setLocation(screenSize.width/2-150, screenSize.height/2-100);
		f.setVisible(true);

	}

}
