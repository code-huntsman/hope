// 4.Write a Java Program to implement the concept of multithreading with priorities to them.
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