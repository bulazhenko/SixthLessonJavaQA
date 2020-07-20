package com.customertimes.task4;

//4) Create a class A. Add several fields, two methods and parameterized constructors to it.
// Create a class B that extends class A.
//Demonstrate in you program how class's B constructor should call class's A constructor to create a new object.
// Override one method of the class A to fully change it's behavior.
// Override another method to add some extra functionality to it, but it should then call class's A method.
// Create a test class and create several objects of class A and class B and call their methods.

public class Test {
    public static void main(String[] args) {

        Car car1 = new Car(1500, 3.5, 400);
        Car car2 = new Car(1600, 3.0, 280);
        car1.race(car2);
        System.out.println(car1.race(car2));

        SportCar ToyotaSupra = new SportCar(1100, 2.8, 780, true);
        SportCar NissanS14 = new SportCar(1300, 3.0, 320, false);
        System.out.println(ToyotaSupra.race(NissanS14));
    }
}
