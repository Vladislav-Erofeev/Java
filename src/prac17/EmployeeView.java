/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac17;

import java.util.Scanner;

public class EmployeeView {

    public int getCommand() {
        System.out.print("Список команд: \n0) Выход\n1) Вывод всех рабочих в консоль\n2) Добавить нового рабочего\n3)Выбрать рабочего\nВведите команду: ");
        return new Scanner(System.in).nextInt();
    }

    public void display(Employee... obj) {
        for(int i = 0; i < obj.length; i++) {
            System.out.printf("|%-20s||%-20s||%-20s|\n", obj[i].getName(), obj[i].getAge(), obj[i].getIdNumber());
        }
    }

    public String getName() {
        System.out.print("Введите имя: ");
        return new Scanner(System.in).nextLine();
    }

    public int getAge() {
        System.out.print("Введите возраст: ");
        return new Scanner(System.in).nextInt();
    }

    public int getSalary() {
        System.out.print("Введите зп: ");
        return new Scanner(System.in).nextInt();
    }

    public int getNumber() {
        System.out.print("Введите порядковый номер: ");
        return new Scanner(System.in).nextInt() - 1;
    }
}
