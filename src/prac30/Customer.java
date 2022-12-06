/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac30;

public final class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private Address address;

    public Customer(String firstName, String secondName, int age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
