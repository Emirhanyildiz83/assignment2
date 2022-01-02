package com.company;


import java.util.Random;

public class Main {


    public static int[][] matrixCreator() {
        Random numbers = new Random();

        int[][] matrix = new int[4][4];


        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                int r = 1 + numbers.nextInt(30);
                matrix[i][k] = r;
            }
        }
        return matrix;

    }
    public static void main(String[] args) {

        System.out.println("First Matrix");

        int[][] m1;
        m1 = matrixCreator();

        for(int[] k:m1){
            for(int m:k){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        System.out.println("Transpose of First Matrix");

        int[][] tm1 = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tm1[i][j] = m1[j][i];
            }
        }
        for(int[] k:tm1){
            for(int m:k){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        System.out.println("Second Matrix");

        int[][] m2;
        m2 = matrixCreator();

        for(int[] k:m2){
            for(int m:k){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");
        System.out.println("Transpose of Second Matrix");
        int[][] tm2 = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tm2[i][j] = m2[j][i];
            }
        }
        for(int[] k:tm2){
            for(int m:k){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        System.out.println("Summation of the Matrices");

        int[][] sum =new int[4][4];

        for(int i=0; i<4; i++){
            for( int j=0; j<4 ; j++){
                sum[i][j] = m1[i][j] + m2[i][j] ;


            }
        }
        for(int[] k:sum) {
            for (int m : k) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        System.out.println("Subtraction of the matrices");



        int[][] sub =new int[4][4];

        for(int i=0; i<4; i++){
            for( int j=0; j<4 ; j++){
                sub[i][j] = m1[i][j] - m2[i][j] ;


            }
        }
        for(int[] k:sub) {
            for (int m : k) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        System.out.println("Multiplication of the Matrices");


        int[][] mul = new int[4][4];

        for (int j = 0 ; j<4 ; j++){
            for (int k = 0 ; k<4 ; k++){
                for(int n = 0 ; n<4 ; n++ ){
                    mul[j][k] += m1[j][n]*m2[n][k];

                }
            }
        }
        for(int[] k:mul) {
            for (int m : k) {
                System.out.print(m + " ");
            }
            System.out.println();
        }











    }


}
