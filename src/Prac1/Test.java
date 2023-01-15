/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package Prac1;

import prac14.task1.Str;

public class Test {
    private String name;

    public Test(String name) {
        this.name = name;
    }

    public Test() {
        this("default");
    }

    public String getName() {
        return name;
    }
}
