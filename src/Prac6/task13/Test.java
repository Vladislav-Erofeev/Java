/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac6.task13;

public class Test {
    public static void main(String... args)
    {
        StringBuilder2 str = new StringBuilder2("Hello");
        Display display1 = new Display();
        Display display2 = new Display();
        str.setObserver(display1);
        str.setObserver(display2);

        str.delete(2, 3);
        display1.display();

        str.insert("WWW", 3);
        display2.display();

        str.removeObserver(display1);
        str.append("!!!");
        display1.display();
        display2.display();
    }
}
