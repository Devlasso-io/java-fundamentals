/**
 * This class demonstrates various uses of the final keyword in Java
 */
public class FinalExamples {
    
    // Final instance variable
    private final String name;
    
    // Final static constant
    public static final int MAX_SIZE = 100;
    
    /**
     * Constructor initializing final field
     */
    public FinalExamples(String name) {
        this.name = name;  // Must be initialized here or in declaration
    }
    
    /**
     * Final method that cannot be overridden
     */
    public final void displayName() {
        System.out.println("Name: " + name);
    }
    
    /**
     * Method with final parameter
     */
    public void processValue(final int value) {
        // value = 42; // This would cause error - final parameter
        System.out.println("Processing: " + value);
    }
}

/**
 * Example of a final class that cannot be inherited
 */
final class ImmutableClass {
    private final int value;
    
    public ImmutableClass(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
} 