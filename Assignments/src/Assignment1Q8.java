//  8. Write a program to generate Fibonacci series upto 'n' terms using recursive function. Accept n from user.

import java.util.Scanner;
public class Assignment1Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number");
		n=sc.nextInt();
		Assignment1Q8 a=new Assignment1Q8();
		for(i = 0; i < n; i++){
			System.out.print(a.fibonacci(i) +" ");
		}
	}
	int fibonacci(int n) {
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
			return 1;
		}
		return fibonacci(n-2) + fibonacci(n-1);
	}
}
