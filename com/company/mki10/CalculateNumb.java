package com.company.mki10;
public class CalculateNumb {
    public static void main(String[] args) {
        printNumb(5, 10, 15);
    }
    public static void printNumb(int numberOne, int numberTwo, int numberThree) {
        int max = Math.max(Math.max(numberOne, numberTwo), numberThree);
        int min = Math.min(Math.min(numberOne, numberTwo), numberThree);
        System.out.println("Mid of numbers:" +" "+ numberOne+ " " +numberTwo +" "+numberThree + "="+ (numberOne+numberTwo+numberThree-(min+max)));
    }
}