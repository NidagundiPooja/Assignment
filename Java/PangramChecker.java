import java.util.Scanner;

public class PangramChecker {

    // Method to check if the string is a pangram
    public static boolean isPangram(String input) {
        // Convert the input string to lowercase
        input = input.toLowerCase();

        // Create a boolean array to track the presence of each letter
        boolean[] lettersPresent = new boolean[26];

        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') { // Check if the character is a letter
                lettersPresent[c - 'a'] = true;
            }
        }

        // Check if all letters are present
        for (boolean letter : lettersPresent) {
            if (!letter) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present
    }

    public static void main(String[] args) {
        // Create a Scanner to accept user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input is a pangram
        if (isPangram(input)) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is not a pangram.");
        }

        scanner.close();
    }
}
