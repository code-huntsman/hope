// 6.Write a Java Program to demonstrate the Multiple Selection List-box.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;

public class prg6 extends Applet implements ItemListener {
	Label l1;
	List c1;
	String S[];
	int i;
	public void init() {
		String S[] = new String[5];
		for(int i=0; i<5; i++) {
			S[i] = "";
		}
		l1 = new Label("Select Your Favourite Car: ");
		c1 = new List(4,true);
		c1.add("Audi");
		c1.add("BMW");
		c1.add("Jaguare");
		c1.add("Lamborhini");
		c1.add("Porsche");
		add(l1);
		add(c1);
		c1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == c1) {
			S = c1.getSelectedItems();
			repaint();
		}
	}
	public void paint(Graphics g) {
		int y=300, x=200;
		g.drawString("Your Favourite Car is: ", x, y);
		y = y + 20;
		for(int i=0; i<S.length; i++) {
			g.drawString(S[i], x, y);
			y = y + 10;
		}
	}
}
//<applet code=prg6.class width=500 height=500>
//</applet>