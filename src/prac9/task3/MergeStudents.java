package prac9.task3;

import java.util.Comparator;

public class MergeStudents
{
    private Comparator comparator;

    public MergeStudents(Comparator comparator) {
        this.comparator = comparator;
    }


    public Student[] sortArray(Student[] arrayA){
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }

        Student[] arrayB = new Student[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        Student[] arrayC = new Student[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);

        return mergeArray(arrayB, arrayC);
    }

    public Student[] mergeArray(Student [] arrayA, Student[] arrayB) {

        Student[] arrayC = new Student[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (comparator.compare(arrayA[positionA], arrayB[positionB]) < 0) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }

    public Student[] sort(Student[] arrayA, Student[] arrayB)
    {
        Student[] arrayC = sortArray(arrayA);
        Student[] arrayD = sortArray(arrayB);
        return mergeArray(arrayC, arrayD);
    }
}
