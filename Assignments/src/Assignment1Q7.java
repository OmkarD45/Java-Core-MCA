// 7. Write a program to print factorial of an entered number using recursion function.
import java.util.Scanner;
public class Assignment1Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Assignment1Q7 a=new Assignment1Q7();
		long f= a.fact(n);
		System.out.println("Factorial of a number "+n+" : "+ f);
	}
	long fact(int n) {
		if(n>1) {
			return n* fact(n-1);
		}
		else 
			return 1;
	}
}
