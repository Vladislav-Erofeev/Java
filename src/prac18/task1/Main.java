/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac18.task1;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) { System.out.println("Attempted division by zero");
        }
    }
}
