/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no7;

/**
 *
 * @author imamsatrianta
 */
public class Jawaban {
    public static void main(String[] args) {
       getMatrix();
    }
    
    static void getMatrix(){
        int rows = 3, columns = 1;
        int transformation[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int transpose[][] = {{10}, {11}, {12}};
        double multiply[][] = new double[rows][columns];
        double sum;

        for (int k = 0; k < transpose[0].length; k++) {
            for (int e = 0; e < transformation.length; e++) {
                sum = 0;
                for (int f = 0; f < transpose.length; f++) {
                    sum = sum + transformation[e][f] * transpose[f][k];
                }
                multiply[e][k] = sum;
            }
        }
        System.out.println("Hasil Perkaian Matrix:-");
        for (int m = 0; m < rows; m++) {
            for (int n = 0; n < columns; n++) {
                System.out.print(multiply[m][n] + "\t");
            }
            System.out.print("\n");
        }
    }
}
