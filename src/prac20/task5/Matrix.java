/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac20.task5;

import java.util.ArrayList;
import java.util.Comparator;

public class Matrix <T extends Comparable>{
    private ArrayList<ArrayList<T>> matrix;

    public Matrix(T[][] matr) {
        matrix = new ArrayList<>(0);
        for (int i = 0; i < matr.length; i++) {
            matrix.add(new ArrayList<>(0));
            for (int j = 0; j < matr[i].length; j++)
                matrix.get(i).add(matr[i][j]);
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public T min() {
        T min = matrix.get(0).get(0);
        for(ArrayList<T> i : matrix)
            for (T x : i)
                if(min.compareTo(x) == 1)
                    min = x;
        return min;
    }

    public T max() {
        T max = matrix.get(0).get(0);
        for(ArrayList<T> i : matrix)
            for (T x : i)
                if(max.compareTo(x) == -1)
                    max = x;
        return max;
    }

    public void addRow(T[] row) {
        ArrayList<T> temp = new ArrayList<>(0);
        for (int i = 0; i < row.length; i++) {
            temp.add(row[i]);
        }
        matrix.add(temp);
    }

    public void addColumn(T[] column) {
        for(int i = 0; i < matrix.size(); i++) {
            matrix.get(i).add(column[i]);
        }
    }

    public void deleteRow(int index) {
        matrix.remove(index);
    }

    public void deleteColumn(int index) {
        for (int i = 0; i < matrix.size(); i++) {
            matrix.get(i).remove(index);
        }
    }
}
