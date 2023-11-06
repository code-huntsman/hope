// 2.Write a Java Program to implement the cocept of multiple inheritance using Interfaces.
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
