// 8.Write a Java Program to create Menu Bars and pull down menus.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class prg8 extends Applet implements ActionListener {
	
	TextArea textarea;
	public void init() {
		MenuBar menubar = new MenuBar();
		Menu menu1 = new Menu("File");
		Menu submenu1 = new Menu("New");
		MenuItem item = new MenuItem("create");
		
		submenu1.add(item);
		menu1.add(submenu1);
		Menu menu2 = new Menu("Help");
		MenuItem item3 = new MenuItem("Help topics");
		MenuItem item4 = new MenuItem("About Notepad");
		MenuItem item5 = new MenuItem("Help tools");
		
		menu2.add(item3);
		menu2.add(item4);
		menu2.add(item5);
		menubar.add(menu1);
		menubar.add(menu2);
		Component C = this;
		
		while(C!=null && !(C instanceof Frame)) {
			C=C.getParent();
		}
		((Frame)C).setMenuBar(menubar);
		textarea = new TextArea(10,30);
		setLayout(new BorderLayout());
		add("center",textarea);
	}
	public void paint(Graphics g) {
		
	}
	public void actionPerformed(ActionEvent evt) {
		String arg = evt.getActionCommand();
		if(arg.equals("Help Topics")) {
			repaint();
		}
	}
}
//<applet code=prg8.class width=500 height=500>
//</applet>