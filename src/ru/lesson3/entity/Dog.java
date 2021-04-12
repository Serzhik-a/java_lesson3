package ru.lesson3.entity;

import ru.lesson3.enums.Gender;

public class Dog extends Animal {

    public Dog(String name, Integer age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public void say(String message) {
        System.out.println("Gaf Gaf " + message);
    }

    @Override
    public void sleep(Integer sleepMs) {
        System.out.println("Тренируйся вон, на кошках");
    }
}
