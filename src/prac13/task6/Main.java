/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac13.task6;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = new Scanner(System.in).nextLine();

        // приводим путь к правильному формату
        fileName = fileName.replace("\\", "/" );
        fileName = fileName.replace("\"", "");

        String text = new String();
        try (FileReader filer = new FileReader(fileName)) {
            BufferedReader reader = new BufferedReader(filer);
            text = reader.readLine();
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        String[] words = text.split(" ");

        System.out.println(getLine(words));
    }

    public static String getLine(String... words)
    {
        if(words == null)
            return "";
        if(words[0].equals(""))
            return "";

        ArrayList<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(words));
        String result = new String();

        while(isFalse(list))
        {
            Collections.shuffle(list);
        }

        for(String x : list)
        {
            result += x + " ";
        }
        return result;
    }

    public static boolean isFalse(ArrayList<String> wordsList) {
        for (int i = 0; i < wordsList.size() - 1; i++) {
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get(i + 1).toLowerCase();
            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0)) return true;
        }
        return false;
    }
}
