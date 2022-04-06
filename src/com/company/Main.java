package com.company;

public class Main {

    public static void main(String[] args) {
        //Задача 1+2
        int [] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        double [] numbers1 = {1.57, 7.654, 9.986};
        for (int d =0; d < numbers1.length; d++) {
            System.out.print(numbers1[d] + ",");
        }
        System.out.println();
        int [] numbers2 = {3,4,5};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + ", ");
        }
        System.out.println();
        // Задача 3
        int [] numbers3 = new int[3];
        for (int i = numbers3.length - 1; i >=0 ; i--) {
            numbers3[i] = i+1;
            System.out.print(numbers3[i] + ",");
        }
        System.out.println();
        double [] numbers4 = {1.57, 7.654, 9.986};
        for (int i = numbers4.length - 1; i >=0; i--) {
            System.out.print(numbers4[i] + ",");
        }
        System.out.println();
        int [] numbers5 = {3,4,5};
        for (int i = numbers5.length - 1; i>=0; i--) {
            System.out.print(numbers5[i] + ", ");
        }
        System.out.println();
        //Задача 4
        int [] ar = new int[5];
        for (int i = 0; i < 5; i++) {
            ar [i] = i*2;
            System.out.print(ar[i] + ", ");
        }
        }
    }

