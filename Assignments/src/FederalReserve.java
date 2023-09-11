import java.util.Scanner;

public class FederalReserve {

    public static float calculate_total_amount(int count_50, int count_1, int count_2, int count_5) {
        /*
         * Calculates the total value of coins given the number of coins of each denomination.
         * Returns the total value in float format.
         */
        float total = count_50 * 0.5f + count_1 * 1f + count_2 * 2f + count_5 * 5f;
        return total / 100; // divide by 100 to get the total value in dollars
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of 50 cents coins: ");
        int count_50 = scanner.nextInt();

        System.out.println("Enter the number of $1 coins: ");
        int count_1 = scanner.nextInt();

        System.out.println("Enter the number of $2 coins: ");
        int count_2 = scanner.nextInt();

        System.out.println("Enter the number of $5 coins: ");
        int count_5 = scanner.nextInt();

        float total = calculate_total_amount(count_50, count_1, count_2, count_5);
        System.out.println(total*100);
    }
}
