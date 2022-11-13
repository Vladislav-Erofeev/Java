/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac17;

public class EmployeeController {
    private EmployeeModel dataBase;
    private EmployeeView display;

    public EmployeeController(EmployeeView display, EmployeeModel dataBase) {
        this.display = display;
        this.dataBase = dataBase;
    }

    public void start() {
        for(;;) {
            int command = display.getCommand();
            switch (command) {
                case 0:
                    return;
                case 1:
                    display.display(dataBase.getAll());
                    break;
                case 2:
                    dataBase.addEmployee(display.getName(), display.getAge(), display.getSalary());
                    break;
                case 3:
                    display.display(dataBase.get(display.getNumber()));
                    break;
            }
        }
    }
}
