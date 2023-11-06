// 5.Write a Java Program to draw several shapes in the created windows.
import java.awt.*;
import java.applet.*;

public class prg5 extends Applet {
	public void paint(Graphics g) {
		int a[] = {45,20,65,70,85};
		int b[] = {50,65,75,95,57};
		int n = 5;
		
		g.drawLine(0, 12, 30, 12);
		g.drawOval(30, 180, 60, 40);
		g.setColor(Color.red);
		g.fillOval(30, 180, 60, 40);
		g.drawRect(30, 110, 60, 30);
		g.setColor(Color.green);
		g.fillRect(30, 110, 60, 30);
		g.drawPolygon(a, b, n);
		g.setColor(Color.pink);
		g.fillPolygon(a, b, n);
		g.drawRect(250, 100, 70, 70);
		g.setColor(Color.blue);
		g.fillRect(250, 100, 70, 70);
		g.drawRoundRect(250, 180, 100, 90, 50, 50);
		g.setColor(Color.yellow);
		g.fillRoundRect(250, 180, 100, 90, 50, 50);
	}
}
// <applet code=prg5.class width=1000 height=1000>
// </applet>