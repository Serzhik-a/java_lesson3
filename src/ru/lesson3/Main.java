package ru.lesson3;

import ru.lesson3.entity.Animal;
import ru.lesson3.entity.Cat;
import ru.lesson3.entity.Dog;
import ru.lesson3.enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Vasya", 2, Gender.UNKNOWN);
        Cat cat = new Cat ("Milka");
        System.out.println(dog);
        System.out.println(dog);
        dog.say("Дай поесть");
        dog.sleep(100);
        cat.say("cat");
        cat.sleep(20);

        List<Animal> animalActionsList  = new ArrayList<>();
        animalActionsList.add(dog);
        animalActionsList.add(cat);

        animalActionsList.forEach(it -> it.say("Opa")); // тожесамое что и строчкой ниже
        for (AnimalActions actions : animalActionsList) {
            actions.say("opa");
        }
    }

}
