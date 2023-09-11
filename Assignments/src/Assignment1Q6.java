// 6.Write a program to find all prime numbers between entered range.

import java.util.Scanner;
public class Assignment1Q6 {
	public static void main(String[] args) {
		int n1,n2,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		n1=sc.nextInt();	n2=sc.nextInt();
		if(n1<n2) {
			for(i=n1;i<=n2;i++) {
				int flag=0;
				for(j=2;j<i;j++) {
					if(i%j==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println("\t "+j);
				}
			}
		}
		else {
			for(i=n2;i<=n1;i++) {
				int flag=0;
				for(j=2;j<i;j++) {
					if(i%j==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println("\t "+j);
				}
			}
		}
	}
}
