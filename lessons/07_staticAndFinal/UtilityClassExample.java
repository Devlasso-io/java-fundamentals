/**
 * Example of a utility class with static methods
 */
public final class UtilityClassExample {
    
    /**
     * Private constructor to prevent instantiation
     */
    private UtilityClassExample() {
        throw new AssertionError("Utility class should not be instantiated");
    }
    
    /**
     * Static utility method for string operations
     */
    public static String reverseString(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
    
    /**
     * Static utility method for number operations
     */
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    
    /**
     * Static utility method for array operations
     */
    public static int[] sortArray(int[] array) {
        if (array == null) return null;
        int[] sorted = array.clone();
        java.util.Arrays.sort(sorted);
        return sorted;
    }
} 