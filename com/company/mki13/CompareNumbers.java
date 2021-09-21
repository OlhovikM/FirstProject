package com.company.mki13;
public class CompareNumbers {
 public static void main(String[] args) {
  printCompare(25, 39);
 }
 public static void printCompare(int numberOne, int numberTwo) {
  if (numberOne != numberTwo) {
   System.out.println("number" + " " + numberOne + " " + "!=" +" "+ "number" + " " + numberTwo);
  } else {
   System.out.println("number" + " " + numberOne + " " + "=" + "number" + " " + numberTwo);
  }
  if (numberOne < numberTwo) {
   System.out.println("number" + " " + numberOne + " " + "<" +" "+ "number" + " " + numberTwo);
  } else {
   System.out.println("number" + " " + numberOne + " " + ">" + "number" + " " + numberTwo);
 }
  if (numberOne <= numberTwo) {
   System.out.println("number" + " " + numberOne + " " + "<=" +" "+ "number" + " " + numberTwo);
  } else {
   System.out.println("number" + " " + numberOne + " " + ">=" + "number" + " " + numberTwo);
  } 
  }
}