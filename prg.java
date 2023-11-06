//  1.Write a Java Application to extract a portion of a character string and print the extracted string

import java.io.*;
import java.io.DataInputStream;

class prg1 {
	public static void main(String args[]) {
		String str1 = new String();
		String str2 = new String();
		
		int m = 0, n = 0;
		DataInputStream in = new DataInputStream(System.in);
		
		try {
			System.out.println("Enter the String : ");
			str1 = in.readLine();
			System.out.println("String is : " + str1);
			System.out.println("Enter no of Character to be Extracted from String : ");
			m = Integer.parseInt(in.readLine());
			System.out.println("Enter Starting Index : ");
			n = Integer.parseInt(in.readLine());
		}
		catch(Exception e) {
			System.out.println("I/O Error");
		}
		str2 = str1.substring(n,(m+n));
		System.out.println("Extracted String is : " + str2);
	}
}

//2.Write a Java Program to implement the cocept of multiple inheritance using Interfaces.
import java.io.*;

interface Area {
	float compute(float x,float y);
}

class Rectangle implements Area {
	public float compute(float x,float y) {
		return(x*y);
	}
}

class Triangle implements Area {
	public float compute(float x,float y) {
		return(x*y/2);
	}
}

class prg2 {
	public static void main(String args[]) {
		Rectangle rect=new Rectangle();
		Triangle tri=new Triangle();
		Area area;
		area=rect;
		System.out.println("Area of rectangle="+area.compute(1,2));
		area=tri;
		System.out.println("Area of triangle="+area.compute(10,2));
	}
}


//3.Write a Java Program to create an Exception called payout-of-bounds and throw the exception.
import java.io.*;
class cheque extends Exception {
	cheque() {
		String S;
		System.out.println("SORRY YOUR CHEQUE IS DISHONOURED");
	}
}
public class prg3 {
	public static void main(String p[])throws IOException {

		DataInputStream d=new DataInputStream(System.in);
		int bal,wd;
		System.out.println("****************");
		System.out.println("PAY OUT BOUNCE");
		System.out.println("****************");
		System.out.println();
		System.out.println("Enter your amt balance");
		bal=Integer.parseInt(d.readLine());
		System.out.println("Enter the withdrawl amount:");
		wd=Integer.parseInt(d.readLine());
		
		if(wd>=bal) {
			System.out.println();
			new cheque();
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("your cheque is passed!");
			System.out.println();
		}
	}
}

//4.Write a Java Program to implement the concept of multithreading with priorities to them.
import java.io.*;

class S extends Thread {
	int m;
	public void run() {
		for(int i=1; i<=5; i++) {
			m = 7 * i;
			System.out.println("7" + "*" + i + "=" + m);
		}
	}
}
class F extends Thread {
	int m;
	public void run() {
		for(int i=1; i<=5; i++) {
			m = 5 * i;
			System.out.println("5" + "*" + i + "=" + m);
		}
	}
}
class T extends Thread {
	int m;
	public void run() {
		for(int i=1; i<=5; i++) {
			m = 13 * i;
			System.out.println("13" + "*" + i + "=" + m);
		}
	}
}
public class prg4 {
	public static void main(String args[]) {
		System.out.println("**********");
		System.out.println("PRIORITIES OF THREAD");
		System.out.println("**********");
		
		S t1 = new S();
		F t2 = new F();
		T t3 = new T();
		
		t1.setPriority(10);
		t2.setPriority(5);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

//5.Write a Java Program to draw several shapes in the created windows.
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
//<applet code=prg5.class width=1000 height=1000>
//</applet>

//6.Write a Java Program to demonstrate the Multiple Selection List-box.
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

//7.Write a Java Program to create a Frame Name,age,qualification and address with text fields.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;

public class prg7 extends Frame implements ActionListener {
	
	String s1,s2,s3,s4;
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	TextArea t4;
	Button b1,b2;
	public prg7() {
		l1 = new Label("NAME");
		l2 = new Label("AGE");
		l3 = new Label("QUALIFICATION");
		l4 = new Label("ADDRESS");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t4 = new TextArea(05,20);
		b1 = new Button("OK");
		b2 = new Button("Clear");
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		addWindowListener(new n());
		setBackground(Color.green);
		setForeground(Color.red);
	}
	public void actionPerformed(ActionEvent a) {
		String str = a.getActionCommand();
		if(str.equals("ok")) {
			s1 = "Name: " + t1.getText();
			s2 = "Age: " + t2.getText();
			s3 = "Qualification: " + t3.getText();
			s4 = "Address: " + t4.getText();
		}
		else {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
		repaint();
	}
	public void paint(Graphics g) {
		g.drawString(s1,200,200);
		g.drawString(s2,220,220);
		g.drawString(s3,220,240);
		g.drawString(s4,220,260);
	}
	public static void main(String args[]) {
		prg7 z = new prg7();
		z.setVisible(true);
		z.setSize(1000,600);
	}
	class n extends WindowAdapter {
		public void Windowclosing(WindowEvent e) {
			System.exit(10);
		}
	}
}
//<applet code=prg7.class width=500 height=500>
//</applet>

//8.Write a Java Program to create Menu Bars and pull down menus.
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

//9.Write a Java Program to create frames which respond to the mouse clicks.
import java.awt.*;
import java.awt.event.*;

public class prg9 extends Frame implements MouseListener {
	Label l1;
	prg9() {
		l1 = new Label("Welcome to MouseEvent");
		setLayout(new FlowLayout());
		add(l1);
		addMouseListener(this);
		addWindowListener(new W());
	}
	class W extends WindowAdapter {
		public void Windowclosing(WindowEvent e) {
			System.exit(0);
		}
	}
	public void mouseReleased(MouseEvent e) {
		l1.setText("MouseReleased");
	}
	public void mousePressed(MouseEvent e) {
		l1.setText("MousePressed");
	}
	public void mouseExited(MouseEvent e) {
		l1.setText("MouseExited");
	}
	public void mouseEntered(MouseEvent e) {
		l1.setText("MouseEntered");
	}
	public void mouseClicked(MouseEvent e) {
		l1.setText("MouseClicked");
	}
	
	public static void main(String args[]) {
		prg9 W = new prg9(); {
			W.setVisible(true);
			W.setSize(300,500);
		}
	}
}
//<appletcode = prg9.class width=500 height=500>
//</applet>

//10.Write a Java Program to draw circle,square,elipse and rectangle at the mouse click positions.
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
