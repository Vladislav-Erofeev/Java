/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package ex.task27;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        try {
            myArrayList.get(5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
