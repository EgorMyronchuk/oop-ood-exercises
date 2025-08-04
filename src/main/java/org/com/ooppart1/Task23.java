package org.com.ooppart1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Write a program to perform matrix addition using classes and objects, and display the result.
 **/
public class Task23 {

    public static class Matrix {
        int[][] matrix;

        public Matrix(int[][] matrix) {
            int rowCount = matrix.length; // количество строк
            for (int[] row : matrix) {
                if (row.length != rowCount) {
                    break;
                }
            }
            this.matrix = matrix;
        }

        public static void matrixPerform(int[][] matrixToShow) {
            for (int i = 0; i < matrixToShow.length; i++) {
                for (int j = 0; j < matrixToShow.length; j++) {
                    System.out.printf("[%d] ", matrixToShow[i][j]);
                }
                System.out.println();
            }
        }

        public static int[][] matrixAddition(int[][] matrix1, int[][] matrix2) {
            if (matrix1.length != matrix2.length) {
                if (matrix1[0].length != matrix2[0].length) {
                    System.out.println("Matrix lengths do not match");
                    return null;
                }
            }
            int[][] matrixResult = new int[matrix1.length][matrix2[0].length];
            for (int row = 0; row < matrix1.length; row++) {
                for (int collum = 0; collum < matrix1[row].length; collum++) {
                    matrixResult[row][collum] = matrix1[row][collum] + matrix2[row][collum];
                }
            }
            matrixPerform(matrixResult);
            return matrixResult;
        }
    }


    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] arr2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        Matrix m1 = new Matrix(arr1);
        Matrix m2 = new Matrix(arr2);

        Matrix.matrixAddition(m1.matrix, m2.matrix);
    }
}


