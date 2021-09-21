package com.company.mki8;
public class MultiplicationTable {
    public static void main(String[] args) {
        printTable(1, 8);
    }
    public static void printTable(int numberOne,int numberTwo) {
        System.out.println("Multiplication table by 8");
        for (numberOne = 1; numberOne <= 10; numberOne++) {
            System.out.println(numberOne+"x"+numberTwo+"="+(numberOne*numberTwo));
            }
        }
    }
