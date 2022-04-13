package com.dabs;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        System.out.println(Arrays.deepToString(board));

        char[][] secondBoard = new char[][]{
                new char[] {'0', '-', '-'},
                new char[] {'0', '-', '-'},
                new char[] {'0', '-', '-'},
        };

        System.out.println(Arrays.deepToString(secondBoard));
    }
}
