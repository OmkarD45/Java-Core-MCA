//  9.Write a program to calculate volume of cube, cylinder and cuboid 
//  using method overloading(use final variable for pi's value)


import java.util.Scanner;
public class Assignment1Q9 {
	final float pi=(float) 3.14;
	int volume(int side)
	{
		return side*side*side;
	}
	double volume(int r,int h) 
	{
		return (pi*r*r*h);	
	}
	int volume(int l,int w,int h)
	{
		return l*w*h;
	}
	public static void main(String[] args) {
		int side,r,h1,l,w,h2;
		Assignment1Q9 a=new Assignment1Q9();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of a cube: ");
		side=sc.nextInt();
		System.out.println("Volume of cube= "+a.volume(side));
		System.out.println("Enter the radius and height of cylinder: ");
		r=sc.nextInt();		h1=sc.nextInt();
		System.out.println("Volume of cylinder= "+a.volume(r,h1));
		System.out.println("Enter the lenght, width and height of cuboid: ");
		l=sc.nextInt();		w=sc.nextInt();		h2=sc.nextInt();
		System.out.println("Volume of cube= "+a.volume(l,w,h2));
	}

}
