import java.util.Scanner;
public class Assignment2Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println(
					"\n1.Reverse String \n2.Concatenation \n3.Length \n4.Equal Method \n5.UpperCase\n6.Lowercase\n7.Exit");
			System.out.println("Enter your Choice :");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				String nstr = " ";

				System.out.println("Enter String : ");
				String str = sc.next();
				for (int i = 0; i < str.length(); i++) {
					char c = str.charAt(i);
					nstr = c + nstr;
				}
				System.out.println("Reversed String : " + nstr);
				break;
			case 2:
				System.out.println("Enter First String : ");
				String str1 = sc.next();
				System.out.println("Enter Second String : ");
				String str2 = sc.next();
				System.out.println("Concatenated String : " + str1.concat(str2));
				break;
			case 3:
				System.out.println("Enter String : ");
				String str4 = sc.next();
				System.out.println("Length of String : " + str4.length());
				break;
			case 4:
				System.out.println("Enter First String : ");
				String str5 = sc.next();
				System.out.println("Enter Second String : ");
				String str6 = sc.next();
				if (str5.equals(str6)) {
					System.out.println("Strings are Equal");
				} else {
					System.out.println("Strings are Different");
				}
				break;
			case 5:
				System.out.println("Enter String : ");
				String str7 = sc.next();
				System.out.println("UpperCase of String : " + str7.toUpperCase());
				break;
			case 6:
				System.out.println("Enter String : ");
				String str8 = sc.next();
				System.out.println("Lowercase of String : " + str8.toLowerCase());
				break;
			default:
				break;
			}
		} while (ch < 7);
	}
}
