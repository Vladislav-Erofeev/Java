/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package prac20.task5;

public class Test {
    public static void main(String[] args) {
        Integer[][] matr = {{1, 2}, {3, 4}, {5, 6}};
        Matrix<Integer> matrix = new Matrix<>(matr);
        matrix.displayMatrix();

        matrix.addRow(new Integer[]{7, 8});
        System.out.println();
        matrix.displayMatrix();

        matrix.addColumn(new Integer[]{10, 11, 12, 13});
        System.out.println();
        matrix.displayMatrix();

        matrix.deleteRow(1);
        System.out.println();
        matrix.displayMatrix();

        matrix.deleteColumn(1);
        System.out.println();
        matrix.displayMatrix();
        System.out.println("Минимальный элемент: " + matrix.min());
        System.out.println("Максимальный элемент: " + matrix.max());
    }
}
