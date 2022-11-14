/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac18.task5;

public class Main {
    public static void getDetails(String key) throws NullPointerException {
        if(key == null) {
            throw new NullPointerException("null key in getDetails" );
        }
    }

    public static void main(String[] args) {
        try {
            getDetails(null);
        } catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
