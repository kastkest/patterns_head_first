package ru.kasterov.patterns._1_simple_pattern;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
