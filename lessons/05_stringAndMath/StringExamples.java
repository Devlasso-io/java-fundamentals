/**
 * This class demonstrates various String manipulation techniques in Java
 */
public class StringExamples {
    
    /**
     * Demonstrates basic String operations
     */
    public static void stringBasics() {
        // String creation
        String str1 = "Hello";
        String str2 = new String("World");
        
        // String concatenation
        String result1 = str1 + " " + str2;              // Using + operator
        String result2 = str1.concat(" ").concat(str2);  // Using concat()
        
        // String methods
        System.out.println(str1.length());               // Length of string
        System.out.println(str1.toUpperCase());          // Convert to upper case
        System.out.println(str1.substring(0, 3));        // Get substring
    }
    
    /**
     * Demonstrates StringBuilder usage
     */
    public static void stringBuilderExample() {
        StringBuilder sb = new StringBuilder();
        
        // Appending values
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        
        // Modifying the string
        sb.insert(5, ",");
        sb.reverse();
        
        System.out.println(sb.toString());
    }
    
    /**
     * Demonstrates regular expressions
     */
    public static void regexExample() {
        String text = "John Doe, 25 years old";
        
        // Pattern matching
        boolean containsNumbers = text.matches(".*\\d+.*");
        String[] parts = text.split(",");
        String noNumbers = text.replaceAll("\\d+", "");
    }
} 