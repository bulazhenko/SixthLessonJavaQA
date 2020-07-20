package com.customertimes.task5;

//5) Create an abstract class Figure. Add fields width and height to it.
// Add an abstract method "calculateArea" which should be overriden by the concrete figures to calculate its area.

public class Main {
    public static void main(String[] args) {
        Square square = new Square(2.6);
        System.out.println("Calculated Area of the Square = " + square.calculateArea());
    }
}
