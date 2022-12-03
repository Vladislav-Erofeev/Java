/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac21.task4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<File> list = new ArrayList<>();

        String path = new Scanner(System.in).nextLine();
        path.trim();
        // приводим путь к правильному формату
        path = path.replace("\\", "/" );
        path = path.replace("\"", "");

        getList(list, path + '/');

        for(File x : list) {
            System.out.println(x.getName());
        }
    }
    public static void getList(List<File> files, String path) {
        // определяем объект для каталога
        File dir = new File(path);
        // если объект представляет каталог
        if(dir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir.listFiles()){
                if (files.size() == 5)
                    return;
                if(item.isDirectory()){

                    files.add(item);
                }
                else{
                    files.add(item);
                }
            }
        }
    }
}
