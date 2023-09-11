//  5.Write a program to check whether the entered number is 
//  Armstrong or not. e.g. 153, 371.
import java.util.Scanner;
public class Assignment1Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp,digits=0,rem,sum=0;
		temp=n;   
		while(temp>0) {   
			temp = temp/10;   
			digits++;   
		}   
		temp = n;   
		while(temp>0)   
		{        
			rem = temp % 10;   
			sum =(int) (sum+(Math.pow(rem, digits)));   
			temp = temp/10;   
		}
		if(sum==n) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is Not Armstrong");
		}
	}
}
