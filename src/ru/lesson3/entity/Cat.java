package ru.lesson3.entity;

public class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say(String message) {
        System.out.println("meow mewow " + message);
    }

    @Override
    public void sleep(Integer sleepMs) {
        System.out.println("I want to sleep");
    }
}
