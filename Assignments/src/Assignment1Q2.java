//  2.Write a java program to allow the user to input student name and subject marks 
//  you have to show his/her marks and percentage

import java.util.Scanner;
public class Assignment1Q2 {
	Scanner sc=new Scanner(System.in);
	String name;
	int m1,m2,m3,total;
	float per;
	public static void main(String[] args) {
		Assignment1Q2 a=new Assignment1Q2();
		a.accept();
		a.display();
	}
	void accept() {
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your 3 subjects marks (out of 100)");
		m1=sc.nextInt();	m2=sc.nextInt();	m3=sc.nextInt();
		total=m1+m2+m3;
		per=total/3;
	}
	void display() {
		System.out.println("Name: "+name+"\tSub1: "+m1+"\tSub2: "+m2+"\tSub3: "+m3+"\tPercentage: "+per+"%");
	}
}