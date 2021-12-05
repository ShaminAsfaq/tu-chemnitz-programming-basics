package de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.assignment4;

public class Task2 {
    //  It is not mentioned whether the input matrix might contain DOUBLE values or not.
    //  Assuming it will not, I used int[][] and int x.
    //  Input types should be stated clearly.
    public int[] search(int[][] array, int size, int x) {
        for (int idx = 0; idx < size; idx++) {
            for (int tgt = 0; tgt < size; tgt++) {
                if (array[idx][tgt] == x) {
                    return new int[]{idx,tgt};
                }
            }
        }
        return new int[]{};
    }
}
