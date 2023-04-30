package org.example;

public class GoldenRatio {

    public static void main(String[] args) {
        int n = 100; // number of iterations for Fibonacci sequence
        double goldenRatio = calculateGoldenRatio(n);
        System.out.println("Golden Ratio: " + goldenRatio);
    }

    public static double calculateGoldenRatio(int n) {
        double[] fibonacciNumbers = new double[n];

        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        return fibonacciNumbers[n - 1] / fibonacciNumbers[n - 2];
    }
}
