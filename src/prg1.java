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