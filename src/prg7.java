// 7.Write a Java Program to create a Frame Name,age,qualification and address with text fields.
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