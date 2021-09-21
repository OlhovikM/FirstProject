package com.company.mki9;
public class FoundCircle {
        public static void main(String[] args) {
            printCircle(7.5);
        }
        public static void printCircle( double radius) {
            System.out.println("Perimeter of a circle ="+ (2*Math.PI*radius));
            System.out.println("Area of a circle="+(Math.PI*(radius*radius)));
        }
    }


