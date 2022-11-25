/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac13.task3;
import java.util.StringTokenizer;

public class Address1 {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corpus;
    private String flat;

    public Address1(String address) {
        StringTokenizer str = new StringTokenizer(address, ",.;");
        country = str.nextToken().trim();
        region = str.nextToken().trim();
        city = str.nextToken().trim();
        street = str.nextToken().trim();
        house = str.nextToken().trim();
        corpus = str.nextToken().trim();
        flat = str.nextToken().trim();
    }

    public String toString() {
        return String.format("%s %s %s %s %s %s %s", country, region, city, street, house, corpus, flat);
    }
}
