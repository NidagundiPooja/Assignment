
    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

    // Method to convert Roman numeral to integer
    public static int romanToInt(String s) {
        // Map to store Roman numeral values
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Loop through the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));

            if (currentValue < prevValue) {
                total -= currentValue; // Subtract if a smaller value precedes a larger one
            } else {
                total += currentValue; // Add otherwise
            }

            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        // Scanner to accept user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman number: ");
        String romanNumber = scanner.nextLine().toUpperCase(); // Convert input to uppercase for uniformity

        // Convert Roman numeral to integer
        try {
            int result = romanToInt(romanNumber);
            System.out.println("The Roman number " + romanNumber + " converts to " + result);
        } catch (Exception e) {
            System.out.println("Invalid Roman number. Please try again.");
        }

        scanner.close();
    }
}


