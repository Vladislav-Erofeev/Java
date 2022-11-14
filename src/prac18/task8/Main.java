/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac18.task8;

import java.util.Scanner;

public class Main {
    public static void getKey() {
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            try {
                String key = scanner.nextLine();
                printMessage(key);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.print("Enter one more time: ");
            }
        }
    }
    public static void printMessage(String key) throws NullPointerException{

        String message = getDetails(key);
        System.out.println( message );
    }
    public static String getDetails(String key) throws NullPointerException {
        if(key.equals("")) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for: " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}
