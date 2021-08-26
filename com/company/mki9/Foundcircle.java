package com.company.mki9;
public class Foundcircle {
    public static void main(String[] args) {
        printCircle();
    }
    public static void printCircle() {
       double radius=7.5;
       double perimeter=(2*Math.PI*radius);
       double area=Math.PI*(radius*radius);
            System.out.println(perimeter);
        System.out.println(area);
        }
}
