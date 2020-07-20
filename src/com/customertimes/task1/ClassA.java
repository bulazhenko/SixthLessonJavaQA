package com.customertimes.task1;

public class ClassA {
    ClassC c = new ClassC();
    ClassB b = new ClassB();

    ClassA() {
        System.out.println("I came, I saw, I came, I saw");
        ClassC.methodC();
        ClassB.methodB();
    }
}

class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA();
    }
}
