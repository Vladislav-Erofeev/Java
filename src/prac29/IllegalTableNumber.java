/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac29;

public class IllegalTableNumber extends Exception{
    private String address;
    public IllegalTableNumber(String add) {
        super("Illegal table number");

        address = add;
    }

    public String getMessage() {
        return super.getMessage() + ": " + address;
    }
}
