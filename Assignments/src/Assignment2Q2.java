//2)Create abstract class Shape with abstract method area().Write a Java program to 
//calculate are of Rectangle and Triangle.(Inherit Shape class in classes Rectangle and Triangle )

import java.util.Scanner;

abstract class Shape{
	abstract void area();
}
class Rectangle extends Shape{
	int l,b,a;
	public Rectangle(int l,int b) {
		this.l=l;
		this.b=b;
	}
	@Override
	void area() {
		a=l*b;
		System.out.println("Area of Rectangle is= "+a);
	} 
}
class Triangle extends Shape{
	int b,h;
	float a;
	public Triangle(int b,int h) {
		this.b=b;
		this.h=h;
	}
	@Override
	void area() {
		a=(b*h)/2;
		System.out.println("Area of triangle is= "+a);	
	}
}
public class Assignment2Q2 {

	public static void main(String[] args) {
		int l,b,s,h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of Rectangle");
		l=sc.nextInt();		b=sc.nextInt();
		Rectangle r=new Rectangle(l, b);
		r.area();
		System.out.println("Enter the base and height of Triangle");
		h=sc.nextInt(); 	s=sc.nextInt();
		Triangle t=new Triangle(h,s);
		t.area();
		
	}

}
