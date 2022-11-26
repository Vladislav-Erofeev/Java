/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac19;

public class Test {
    public static void main(String[] args) {
        LabClass labClass = new LabClass();
        try {
            labClass.addStudent("Test1", "Test-01", 5);
            labClass.addStudent("Test3", "Test-04", 4);
            labClass.addStudent("Test2", "Test-02", 3);
            labClass.addStudent("Test4", "Test-03", 2);
        } catch (EmptyStringException e){

        }

        LabClassDriver labClassDriver = new LabClassDriver(labClass);
        new LabClassUI(labClassDriver);
    }
}
