package com.company.mki12;
public class MultiplyBinary {
    public static void main(String[] args) {
        printBinary(10, 11);
    }
    public static void printBinary(int numberOne, int numberTwo){
        System.out.print("Product of binary"+" "+numberOne+" "+"and"+" "+numberTwo+"=");
        System.out.print(Integer.toBinaryString(Integer.parseInt("10",2)* Integer.parseInt("11",2)));
    }
}

