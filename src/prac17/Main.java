/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac17;

public class Main {
    public static void main(String[] args) {
        EmployeeModel database = new EmployeeModel();
        database.addEmployee("Vlad", 19, 12);
        database.addEmployee("Fgr", 32, 234);
        database.addEmployee("Fsbb", 312, 234);
        EmployeeView display1 = new EmployeeView();
        EmployeeController controller = new EmployeeController(display1, database);
        controller.start();
    }
}
