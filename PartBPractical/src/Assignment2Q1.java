import java.util.Scanner;
import Mathematics.*;
public class Assignment2Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two No :" );
        int a=sc.nextInt();
        int b= sc.nextInt();

        Maximum m = new Maximum(a,b);
        m.display();

        Power p = new Power(a,b);
        p.disp();
	}
}