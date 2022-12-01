/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac22;

import java.util.Stack;

public class CalculatorDriver {

    private static Stack<Double> stack;
    public static String calculate(String text) {
        text = text.trim(); // удаляем лишние пробелы
        if(text.isEmpty())
            return "";
        stack = new Stack<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < text.length(); i++) {
            if ((int)text.charAt(i) >= (int)'0' && (int)text.charAt(i) <= (int)'9' || (int)text.charAt(i) == '.') {
                end = i;
            } else if (text.charAt(i) == '+' || text.charAt(i) == '-' || text.charAt(i) == '*' || text.charAt(i) == '/') {
                try {
                        try {
                            Double num = Double.parseDouble(text.substring(start, end + 1));
                            start = ++end;
                            stack.push(num);
                        } catch (Exception e) {}
                    double num = stack.pop();
                    double num1 = stack.pop();
                    switch (text.charAt(i)) {
                        case '+':
                            stack.push(num1 + num);
                            break;
                        case '-':
                            stack.push(num1 - num);
                            break;
                        case '*':
                            stack.push(num1 * num);
                            break;
                        case '/':
                            stack.push(num1 / num);
                            break;
                    }
                } catch (Exception exc) {

                    System.out.println("Ошибка! Невозможно выполнить POP для пустого стека");
                    return "Ошибка! Выражение задано неправильно";
                }
                start = i+1;
            } else {
                try {
                    Double num = Double.parseDouble(text.substring(start, end + 1).trim());
                    start = ++end;
                    stack.push(num);
                } catch (Exception e) {}
            }
        }
        try {
            Double num = Double.parseDouble(text.substring(start, end + 1));
            stack.push(num);
        } catch (Exception e) {}
        double ans = stack.pop();
        if(!stack.empty()) {
            System.out.println("Ошибка! Стек не пустой");
            return "Ошибка! Выражение задано неправильно";
        }
        int temp = (int)ans;
        if (ans - temp == 0) {
            return Integer.toString(temp);
        }
        return Double.toString(ans);
    }
}