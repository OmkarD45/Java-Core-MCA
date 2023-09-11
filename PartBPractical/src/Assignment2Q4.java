import java.util.Scanner;
public class Assignment2Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String str1 = sc.next();
		System.out.println("Enter Second String : ");
		String str2 = sc.next();
		if (str1.equals(str2)) {
			System.out.println("String are Equal ");
		} else {
			System.out.println("String are Different ");
		}
	}
}
