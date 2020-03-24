package com;

import java.util.Scanner;

public class Lab4Ex3 {
    public static int check_prim(int x) {
        if (x < 2)
            return 0;
        if (x == 2)
            return 1;
        if (x % 2 == 0)
            return 0;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, r = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] mat = new int[n][m];
        int[][] mat2 = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
                mat2[i][j] = 1 - check_prim(mat[i][j]);
                r += mat2[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(r);
    }
}
