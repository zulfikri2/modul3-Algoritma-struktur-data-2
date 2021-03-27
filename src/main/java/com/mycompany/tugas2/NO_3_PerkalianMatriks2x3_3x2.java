package com.mycompany.tugas2;

public class NO_3_PerkalianMatriks2x3_3x2 {
    public static void main(String[] args) {
        int[][] matriks_a = {
                {2, 4, 6},
                {4, 5, 6}
        };
        int[][] matriks_b = {
                {10, 10},
                {10, 10},
                {10, 10}
        };

        int baris_a = matriks_a.length;
        int kolom_a = matriks_a[0].length;
        int baris_b = matriks_b.length;
        int kolom_b = matriks_b[0].length;
        int[][] hasilKali = new int[baris_a][kolom_b];
        for (int i = 0; i < baris_a; i++) {
            for (int j = 0; j < kolom_b; j++) {
                for (int k = 0; k < kolom_a; k++) {
                    hasilKali[i][j] = hasilKali[i][j] + (matriks_a[i][k] * matriks_b[k][j]);
                }
            }
        }
        for (int[] x : hasilKali) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}


