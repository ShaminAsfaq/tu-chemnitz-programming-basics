package de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.assignment4;

public class Task1 {
    //  Returning DOUBLE in case there are fractions after the division.
    public double productDiagonals(int[][] array, int size) {
        double product = 1;

        for (int i = 0; i < size; i++) {
            product *= array[i][i] * array[i][size-i-1];
        }

        if (size%2 == 1) {
            product /= array[size/2][size/2];
        }
        return product;
    }
}