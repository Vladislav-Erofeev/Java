/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac18.task7;

import java.util.Scanner;

public class Main {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e) {
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == null) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}

//Yar2012/%
