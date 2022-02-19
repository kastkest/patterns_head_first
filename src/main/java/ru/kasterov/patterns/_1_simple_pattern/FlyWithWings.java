package ru.kasterov.patterns._1_simple_pattern;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m flying!!!");
    }
}
