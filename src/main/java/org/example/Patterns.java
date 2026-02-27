package org.example;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
//        printSquare(3);
        int[] arr = {4 , 1 , 3 , 3};
//        countBadPairs(arr);
    }

    public static void printSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
