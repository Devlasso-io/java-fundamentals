/**
 * This class demonstrates handling command line arguments in Java
 */
public class CommandLineExample {
    
    /**
     * Main method showing command line argument processing
     */
    public static void main(String[] args) {
        // Basic argument checking
        if (args.length == 0) {
            System.out.println("No arguments provided!");
            return;
        }
        
        // Processing arguments
        processArguments(args);
    }
    
    /**
     * Demonstrates argument processing and validation
     */
    private static void processArguments(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try {
                // Try parsing as different types
                if (isInteger(args[i])) {
                    int number = Integer.parseInt(args[i]);
                    System.out.println("Integer argument: " + number);
                } else if (isDouble(args[i])) {
                    double number = Double.parseDouble(args[i]);
                    System.out.println("Double argument: " + number);
                } else {
                    System.out.println("String argument: " + args[i]);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error processing argument: " + args[i]);
            }
        }
    }
    
    /**
     * Validates if a string can be parsed as Integer
     */
    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    /**
     * Validates if a string can be parsed as Double
     */
    private static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
} 