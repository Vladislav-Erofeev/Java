/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac18.task6;

public class Main {
    public static void printMessage(String key) {
        try {
             String message = getDetails(key);
            System.out.println( message );
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
    public static String getDetails(String key) throws NullPointerException {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for: " + key;
    }

    public static void main(String[] args) {
        printMessage(null);
    }
}
