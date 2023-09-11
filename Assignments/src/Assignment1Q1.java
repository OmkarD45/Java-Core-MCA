//  1.Write a java Program to check entered number is prime or not

import java.util.Scanner;
public class Assignment1Q1 {
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<n;i++) {
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("The no is prime");
		}
		else {
			System.out.println("The no is not prime");
		}
	}

}
