package com.company.mki7;
public class Mathoperations {
    public static void main(String[] args) {
        printNumbers(125, 24);
    }
    public static void printNumbers(int numberOne, int numberTwo) {
        System.out.println("Sum of 125 and 24="+(numberOne+numberTwo));
        System.out.println("125 minus 24="+(numberOne-numberTwo));
        System.out.println("Product 125 and 24="+(numberOne*numberTwo));
        System.out.println("125 divide by 24="+(numberOne/numberTwo));
        System.out.println("125 mod by 24"+"="+(numberOne%numberTwo));
    }
}

