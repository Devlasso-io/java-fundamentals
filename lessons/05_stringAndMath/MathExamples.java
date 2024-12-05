/**
 * This class demonstrates various mathematical operations in Java
 */
public class MathExamples {
    
    /**
     * Demonstrates basic Math class operations
     */
    public static void mathBasics() {
        // Basic operations
        double power = Math.pow(2, 3);      // 2³ = 8
        double squareRoot = Math.sqrt(16);   // √16 = 4
        double absolute = Math.abs(-5);      // |-5| = 5
        
        // Rounding
        double ceil = Math.ceil(3.2);        // 4.0
        double floor = Math.floor(3.2);      // 3.0
        long rounded = Math.round(3.2);      // 3
    }
    
    /**
     * Demonstrates random number generation
     */
    public static void randomNumbers() {
        // Generate random numbers
        double random = Math.random();              // 0.0 to 1.0
        int randomInt = (int)(Math.random() * 100); // 0 to 99
        
        // Using Random class
        java.util.Random rand = new java.util.Random();
        int randomNumber = rand.nextInt(100);       // 0 to 99
    }
    
    /**
     * Demonstrates trigonometric operations
     */
    public static void trigonometry() {
        double angle = Math.PI / 4;  // 45 degrees
        
        double sine = Math.sin(angle);
        double cosine = Math.cos(angle);
        double tangent = Math.tan(angle);
    }
} 