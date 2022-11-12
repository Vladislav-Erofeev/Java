/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac14.task1;

public class Str implements Filter{
    public boolean apply(Object o) {
        if(o.toString().length() > 5)
            return false;
        return true;
    }
}
