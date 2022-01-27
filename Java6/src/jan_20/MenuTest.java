package jan_20;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Parent");
		f.setSize(300,200);
		
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("File");
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		
		Menu mOther = new Menu("Others");
		MenuItem miExit = new MenuItem("Exit");
		
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miOpen);
		mFile.addSeparator();
		mFile.add(miExit);
		
		MenuItem miprint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print Setup...");
		mOther.add(miprint);
		mOther.add(miPreview);
		mOther.add(miSetup);
		
		Menu mEdit = new Menu("Edit");
		Menu mView = new Menu("View");
		Menu mHelp = new Menu("Help");
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
		mView.add(miStatusbar);
		
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.setHelpMenu(mHelp);
		
		f.setMenuBar(mb);
		f.setVisible(true);
		
	}

}
