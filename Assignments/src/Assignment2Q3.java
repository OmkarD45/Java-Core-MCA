//3) Write a java program to calculate area of Cylinder and Circle.(Use super keyword) 

import java.util.Scanner;
class Cylinder{
	Scanner s=new Scanner(System.in);
	int r,h;
	double a;
	void areaCylinder() {
		System.out.println("Enter the radius and height of cylinder");
		r=s.nextInt();
		h=s.nextInt();
		a=(r*h)*2*3.14;
		System.out.println("Area of Cylinder= "+a);
	}
}
class Circle extends Cylinder{
	int r;
	double a;
	void areaCircle() {
		super.areaCylinder();
		System.out.println("Enter the radius of circle ");
		r=s.nextInt();
		a=(r*r)*3.14;
		System.out.println("Area of circle= "+a);
	}
}
public class Assignment2Q3 {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.areaCircle();
	}
}
