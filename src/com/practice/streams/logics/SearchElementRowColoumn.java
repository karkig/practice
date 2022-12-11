package com.practice.streams.logics;

/*Given an n x n matrix and a number x, find the position of x in the matrix if it is present in it. Otherwise, print “Not Found”.
In the given matrix, every row and column is sorted in increasing order. The designed algorithm should have linear time complexity.

 */
public class SearchElementRowColoumn {
    // driver program to test above function
    public static void main(String[] args) {
        int mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        boolean result = search(mat, 4, 32);
        System.out.println("element found status : " + result);
    }

    private static boolean search(int[][] mat, int n, int x) {
        int i = 0, j = n - 1;
        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                return true;
            }
            if (mat[i][j] < x) {
                i++;
            } else {
                j--;
            }

        }
        return false; // if ( i==n || j== -1 )
    }
}
