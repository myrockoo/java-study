package jan_20;

import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("parent");
		f.setSize(300,200);
		
		FileDialog fileOpen = new FileDialog(f,"File Open", FileDialog.LOAD);
		
		f.setVisible(true);
		fileOpen.setDirectory("C:\\Windows");
		fileOpen.setVisible(true);
		
		System.out.println(fileOpen.getDirectory()+fileOpen.getFile());

	}

}
