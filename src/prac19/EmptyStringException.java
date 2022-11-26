/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac19;

public class EmptyStringException extends Exception{
    public EmptyStringException() {
        super("Data not found");
    }
}
