/**
 * This class demonstrates various uses of the static keyword in Java
 */
public class StaticExamples {
    
    // Static variable
    private static int instanceCount = 0;
    
    // Static constant
    public static final double PI = 3.14159;
    
    // Instance variable
    private String name;
    
    // Static initialization block
    static {
        System.out.println("Class is being loaded");
        instanceCount = 0;
    }
    
    /**
     * Constructor incrementing instance count
     */
    public StaticExamples(String name) {
        this.name = name;
        instanceCount++;
    }
    
    /**
     * Static method to get instance count
     */
    public static int getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * Static utility method
     */
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
    
    /**
     * Static nested class example
     */
    public static class StaticNestedClass {
        public void display() {
            System.out.println("Total instances: " + instanceCount);
        }
    }
} 