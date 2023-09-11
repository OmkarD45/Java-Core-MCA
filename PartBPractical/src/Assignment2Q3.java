import java.util.*;
public class Assignment2Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter 10 array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("\n Array elements : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");

		int max = arr[0];
		for (int i = 0; i < 10; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("\n" + max + " is Maximum among all the Array Elements ");
		int min = arr[0];
		for (int i = 0; i < 10; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("\n" + min + " is Minimum among all the Array Elements ");
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + arr[i];
		}
		System.out.println("\n" + sum + " is the Sum of all the Array Elements ");
		float avg = (float) sum / 10;
		System.out.println("\n" + avg + " is the Avg of all the Array Elements ");
	}
}
