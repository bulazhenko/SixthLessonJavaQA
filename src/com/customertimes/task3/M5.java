package com.customertimes.task3;

public class M5 extends BMW {
    public M5(String name, String model) {
        super(name, model);
    }

    static M5 M5 = new M5("BMW", "M5");

    @Override
    public void steer(int direction) {
        super.steer(direction);
        System.out.println("Direction = " + M5.getCurrentDirection());
    }

    public static void main(String[] args) {
        System.out.println(M5.getName());
        System.out.println(M5.getSize());
        M5.steer(70);
        M5.move(120, 160);
        System.out.println("Direction = " + M5.getCurrentDirection());
        System.out.println("Velocity = " + M5.getCurrentVelocity());
    }
}

