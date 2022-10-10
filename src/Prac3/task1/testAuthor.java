package Prac3.task1;

import java.util.Scanner;

public class testAuthor
{
    protected static Author create()
    {
        Author obj = new Author("", "", 'm');
        String name;
        String mail;
        char gender;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = in.nextLine();
        System.out.print("Введите почту: ");
        mail = in.nextLine();
        System.out.print("Введите пол: ");
        gender = in.next().charAt(0);
        obj.setEmail(mail);
        obj.setGender(gender);
        obj.setName(name);
        return obj;
    }

    public static void main(String[] args)
    {
        Author obj = create();
        System.out.println(obj.getEmail() + " " + obj.getName() + " " + obj.getGender());
        System.out.println(obj.toString());
    }
}
