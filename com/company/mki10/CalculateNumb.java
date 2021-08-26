package com.company.mki10;
public class CalculateNumb {
    public static void main(String[] args) {
        printNumb();
    }

    public static void printNumb() {
        int numb1 = 5; int numb2 = 10; int numb3 = 15;
        int max = Math.max(Math.max(numb1, numb2), numb3);
        int min = Math.min(Math.min(numb1, numb2), numb3);
        int mid = numb1 + numb2 + numb3 - (min + max);
        System.out.println(mid);
    }
}