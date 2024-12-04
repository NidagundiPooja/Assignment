
import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        // Initialize the array
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Print the original array
        System.out.println("Original Array:");
        printArray(array);

        // Shuffle the array
        shuffleArray(array);

        // Print the shuffled array
        System.out.println("Shuffled Array:");
        printArray(array);
    }

    // Method to shuffle the array
    private static void shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i
            int j = random.nextInt(i + 1);

            // Swap array[i] with array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // Method to print the array
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
 
