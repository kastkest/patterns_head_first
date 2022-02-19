package ru.kasterov.patterns._1_simple_pattern;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
