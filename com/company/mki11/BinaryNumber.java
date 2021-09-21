package com.company.mki11;
public class BinaryNumber {
    public static void main(String[] args) {
 printBinary(10, 11);
    }
    public static void printBinary(int numberOne, int numberTwo){
  System.out.print("Sum of binary"+" "+numberOne+" "+"and"+" "+numberTwo+"=");
  System.out.print(Integer.toBinaryString(Integer.parseInt("10",2)+ Integer.parseInt("11",2)));
    }
}