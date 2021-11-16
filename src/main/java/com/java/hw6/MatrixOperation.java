package com.java.hw6;

import java.util.Arrays;

// головна діагональ (що йде з лівого верхнього кута в правий нижній кут).
// побічна діагональ (що йде з лівого нижнього кута в правий верхній кут).
public class MatrixOperation {
    public static void main(String[] args) {
        int[][] matrix = {
                {-2, 31, 6, 7},
                {15, -42, 1, 0},
                {9, -7, 12, 19},
                {55, 34, 1, -10}
        };

        System.out.println("MIN:" + getMin(matrix));
        System.out.println("MAX:" + getMax(matrix));
        System.out.println(Arrays.toString(getDiagonal(matrix)));
        System.out.println(Arrays.toString(getCounterDiagonal(matrix)));


    }

    public static int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] i : matrix) {
            for (int j : i) {
                if (min > j) {
                    min = j;
                }
            }
        }
        return min;
    }

    public static int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] i : matrix) {
            for (int j : i) {
                if (max < j) {
                    max = j;
                }
            }
        }
        return max;
    }

    //  строка[] столбец[]
//    00  01  02  03
//    10  11  12  13
//    20  21  22  23
//    30  31  32  33
    public static int[] getDiagonal(int[][] matrix) {
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {

            array[i] = matrix[i][i];
        }
        return array;
    }

    public static int[] getCounterDiagonal(int[][] matrix) {
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][matrix.length-1-i];
        }
        return array;

    }
}
