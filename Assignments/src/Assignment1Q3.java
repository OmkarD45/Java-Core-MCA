// 3..Write a java program to get input basic salary from the user and calculate his/her salary slip as per following rules DA 50%, HRA 18%,TADA 5 % and 10% income tax. 

import java.util.Scanner;
public class Assignment1Q3 {
	public static void main(String[] args) {
		int sal;
		int DA,HRA,TADA,IT;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Your Salary:");
		sal=s.nextInt();
		DA = 50*(sal/100);
		HRA = 18*(sal/100);
		TADA = 5*(sal/100);
		IT = 10*(sal/100);
		System.out.println(" Your total salary : " + sal);
		System.out.println(" DA is : " + DA);
		System.out.println(" HRA is : " + HRA);
		System.out.println("Income Tax  : " + IT);
		System.out.println("TADA is : " + TADA);
	}

}
