package com.psyh2409;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        percentCalc();
        arrReverter(5);
        twoDimensionalArray(5, 7);

        scanner.close();
    }

    private static double[][] twoDimensionalArray(int rows, int columns){
        double[][] darr = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                darr[i][j] = Math.random();
                p(String.format(j==0? "%.2f" : ", %.2f", darr[i][j]));
            }
            pln("");
        }
        return darr;
    }

    private static void arrReverter(int len) {
        int[] arr = new int[len];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            arr[i] = inter(inputer("Enter some integer: "));
            sb.append(i == 0 ? arr[i] : ", "+arr[i]);
        }
        pln(sb);
        for (int i = len-1;  i >= 0; i--) {
            p(i == len-1 ? arr[i] : ", "+arr[i]);
        }
        pln("");
    }


    private static void percentCalc() {
        double m = doubler(inputer("How much do you want to put in?"));
        double n = doubler(inputer("At what percentage?"))/100;
        double k = doubler(inputer("How long?"));
        for (int i = 0; i < k; i++) {
            m = m + m * n;
        }
        System.out.printf("You'll have %.2f \n", m);
    }

    private static double doubler(String s){
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException nfe) {
            return random.nextDouble();
        }
    }

    private static int inter(String s){
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            return random.nextInt();
        }
    }

    private static String inputer(String message) {
        pln(message);
        return scanner.nextLine();
    }

    private static void pln(Object o) {
        System.out.println(o);
    }
    private static void p(Object o) {
        System.out.print(o);
    }
}
