// 10.Write a Java Program to draw circle,square,elipse and rectangle at the mouse click positions.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class prg10 extends Applet {
	int x = 0,y=0,c=0;
	public void init() {
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				c++;
				x = me.getX();
				y = me.getY();
				repaint();
			}
		});
	}
	public void paint(Graphics g) {
		if(c%4 == 1)
			g.drawOval(x, y, 150, 150);
		else if(c%4 == 2)
			g.drawRect(x, y, 150, 150);
		else if(c%4 == 3)
			g.drawOval(x, y, 100, 150);
		else if(c%4 == 4)
			g.drawRect(x, y, 100, 150);
	}
}
/*<html>
<head>
<title> Mouse Click </title></head>
<body>
<applet code=prg10.class width=500 height=800>
</applet>
</html>*/