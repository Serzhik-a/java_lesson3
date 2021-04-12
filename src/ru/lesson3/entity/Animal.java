package ru.lesson3.entity;

import ru.lesson3.AnimalActions;
import ru.lesson3.enums.Gender;

public abstract class Animal implements AnimalActions {
    protected String name;
    protected Integer age;
    protected Gender gender;


}
