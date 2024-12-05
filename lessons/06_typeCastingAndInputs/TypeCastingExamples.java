/**
 * This class demonstrates various type casting scenarios in Java
 */
public class TypeCastingExamples {
    
    /**
     * Demonstrates primitive type casting
     */
    public static void primitiveCasting() {
        // Implicit casting (widening)
        int intNumber = 100;
        long longNumber = intNumber;    // int to long
        float floatNumber = longNumber; // long to float
        
        // Explicit casting (narrowing)
        double doubleNumber = 100.04;
        long longValue = (long)doubleNumber;    // double to long
        int intValue = (int)longValue;          // long to int
        
        // Potential data loss example
        int largeNumber = 1000;
        byte smallNumber = (byte)largeNumber;   // Possible data loss!
    }
    
    /**
     * Demonstrates object type casting
     */
    public static void objectCasting() {
        // Upcasting
        Object obj = "Hello World";    // String to Object
        
        // Downcasting
        if (obj instanceof String) {
            String str = (String)obj;   // Object to String
            System.out.println(str.toUpperCase());
        }
        
        // Array casting example
        Object[] objArray = new String[3];
        String[] strArray = (String[])objArray;
    }
    
    /**
     * Demonstrates wrapper class conversion
     */
    public static void wrapperConversion() {
        // Primitive to Wrapper (boxing)
        int primitive = 42;
        Integer wrapper = Integer.valueOf(primitive);
        
        // Wrapper to primitive (unboxing)
        Double doubleWrapper = 3.14;
        double primitiveDouble = doubleWrapper.doubleValue();
        
        // Auto-boxing and unboxing
        Integer number = 100;    // Auto-boxing
        int value = number;      // Auto-unboxing
    }
} 