package ru.kasterov.patterns._1_simple_pattern;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}
