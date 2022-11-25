/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac13.task3;

public class Test {
    public static void main(String[] args) {
        Address addr = new Address("Россия,  Московская обл, Ногинск, Комсомольская, 14, 1, 7");
        Address[] address = {new Address("Россия,  Московская обл, Ногинск, Комсомольская, 14, 1, 7"),
                new Address("Россия, Ленинградская обл, Санкт-Петербург, Красноармейская, 12, 3, 1")};
        Address1[] address1s = {new Address1("Россия;  Московская обл; Ногинск; Комсомольская; 14, 1; 7"),
        new Address1("Россия, Ленинградская обл., Санкт-Петербург; Красноармейская, 12, 3, 1") };
        for(Address x : address)
            System.out.println(x);
        for(Address1 x : address1s)
            System.out.println(x);
    }
}
