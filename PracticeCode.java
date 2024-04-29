import java.util.Scanner;

public class PracticeCode {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of integers with the specified size
        int[] numbers = new int[size];

        // Prompt the user to enter elements for the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate and print the sum of all elements in the array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        // Determine and print the maximum and minimum elements in the array
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        // Count and print the number of even and odd elements in the array
        int evenCount = 0;
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);

        // Close the scanner to release resources
        scanner.close();
    }
}
