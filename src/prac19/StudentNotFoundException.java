/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac19;

public class StudentNotFoundException extends Exception {
    int id;

    public StudentNotFoundException(int index) {
        super("Student not found");
        id = index;
    }

    public String getMessage() {
        return super.getMessage() + ", id: " + id;
    }
}
