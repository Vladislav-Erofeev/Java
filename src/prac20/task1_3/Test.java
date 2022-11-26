/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac20.task1_3;

public class Test {
    public static void main(String[] args) {
        Task1<Integer, String, Animal> test = new Task1<>(5, "temp", new Animal("testName", 3));
        System.out.println(test.getClasses());
    }
}
