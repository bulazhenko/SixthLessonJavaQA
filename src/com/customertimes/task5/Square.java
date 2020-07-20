package com.customertimes.task5;

public class Square extends Figure {
    double side;

    public Square(double side) {
        if (side > 0)
            this.side = side;
        else
            throw new ArithmeticException("Side should be greater then 0");
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
