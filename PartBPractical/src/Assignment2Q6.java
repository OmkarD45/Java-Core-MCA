import java.util.Scanner;
public class Assignment2Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows and column : ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] m1 = new int[r][c];
		int[][] transpose = new int[r][c];
		System.out.println("Enter Matrix: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				transpose[i][j] = m1[j][i];
			}
		}
		System.out.println("Original Matrix: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpose of Matrix: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
