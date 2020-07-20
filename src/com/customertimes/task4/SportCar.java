package com.customertimes.task4;

//SportCar = ClassB

public class SportCar extends Car {
    boolean turboEngine;

    public SportCar(int weight, double acceleration, int HP, boolean turboEngine) {
        super(weight, acceleration, HP);
        this.turboEngine = turboEngine;
    }

    @Override
    public boolean race(Car anotherCar) {
        return weight <= anotherCar.weight
                || acceleration >= anotherCar.acceleration
                || HP > anotherCar.HP
                || this.turboEngine;
    }
}