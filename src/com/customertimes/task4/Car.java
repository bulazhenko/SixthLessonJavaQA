package com.customertimes.task4;

//Car = ClassA

public class Car {
    public int weight;
    public int HP;
    public double acceleration;

    public Car(int weight, double acceleration, int HP) {
        this.weight = weight;
        this.acceleration = acceleration;
        this.HP = HP;
    }

    public boolean race(Car anotherCar) {
        return weight > anotherCar.weight && acceleration >= anotherCar.acceleration && HP <= anotherCar.HP;
    }
}
