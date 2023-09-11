import java.util.*;

public class DancingNumber {
    
    public static int[] print_dancing_numbers(int dancing_limit) {
        // Initialize the result array with the single-digit dancing numbers
        int[] result = new int[Math.min(dancing_limit, 10)];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        
        // Iterate through all possible dancing numbers greater than 9 and less than or equal to the limit
        int index = 0;
        for (int num = 0; num <= dancing_limit; num++) {
            int lastDigit = num % 10;
            int remainingDigits = num / 10;
            
            // Check if all adjacent digits in the remaining digits differ by 1
            boolean isDancing = true;
            while (remainingDigits > 0) {
                int currentDigit = remainingDigits % 10;
                remainingDigits /= 10;
                if (Math.abs(currentDigit - lastDigit) != 1 && Math.abs(currentDigit - lastDigit) != 9) {
                    isDancing = false;
                    break;
                }
                lastDigit = currentDigit;
            }
            
            // Add the dancing number to the result array if it is a dancing number
            if (isDancing) {
                if (index >= result.length) {
                    result = Arrays.copyOf(result, result.length + 1);
                }
                result[index++] = num;
            }
        }
        
        // Return the result array containing all dancing numbers less than or equal to the limit
        return Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {
        // Read the input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dancing limit: ");
        int dancing_limit = input.nextInt();
        
        // Call the print_dancing_numbers() function and print the result
        int[] result = print_dancing_numbers(dancing_limit);
        System.out.println(Arrays.toString(result));
    }
}
