// 3.Write a Java Program to create an Exception called payout-of-bounds and throw the exception.
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