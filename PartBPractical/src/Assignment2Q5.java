import java.util.Scanner;
import Games.Indoor;
import Games.Outdoor;
public class Assignment2Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("\n1.Indoor \n2.Outdoor\n\nEnter Your Choice : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter how many players : ");
				int n = sc.nextInt();
				Indoor[] in = new Indoor[n];
				System.out.println("\nEnter " + n + " Indoor Player Name : ");
				for (int i = 0; i < in.length; i++) {
					String p_name = sc.next();
					in[i] = new Indoor(p_name);
				}
				System.out.println("\nIndoor Players : ");
				for (int j = 0; j < in.length; j++) {
					in[j].display();
				}
				break;
			case 2:
				System.out.println("Enter how many players : ");
				int n1 = sc.nextInt();
				Outdoor[] out = new Outdoor[n1];

				System.out.println("\nEnter " + n1 + " Outdoor Player Name : ");
				for (int i = 0; i < out.length; i++) {
					String p_name = sc.next();
					out[i] = new Outdoor(p_name);
				}
				System.out.println("\nOutdoor Players : ");
				for (int j = 0; j < out.length; j++) {
					out[j].display();
				}
			}
		} while (ch < 3);
	}
}
