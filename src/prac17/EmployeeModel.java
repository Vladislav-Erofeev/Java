/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac17;

import java.util.ArrayList;
public class EmployeeModel {
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(String name, int age, int salary) {
        employees.add(new Employee(name, age, salary));
    }

    public Employee get(int index) {
        return employees.get(index);
    }

    public Employee[] getAll() {
        Employee[] temp = new Employee[employees.size()];
        for(int i = 0; i < employees.size(); i++) {
            temp[i] = employees.get(i);
        }
        return temp;
    }
}
