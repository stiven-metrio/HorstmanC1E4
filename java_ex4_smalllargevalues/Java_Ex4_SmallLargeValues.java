/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #4
 * Write a program that prints the smallest and largest positive double values. 
 * Hint: Look up Math.nextUp in the Java API.
 */
package java_ex4_smalllargevalues;

/**
 *
 * @author jhonatan
 */
public class Java_Ex4_SmallLargeValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double maxValue = Double.MAX_VALUE;
        double minValue = Double.MIN_VALUE;
        System.out.print("Maximum Double value: "); System.out.println(maxValue);
        System.out.print("Minimum Double value: "); System.out.println(minValue);
    }
    
}
