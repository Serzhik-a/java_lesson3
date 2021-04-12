package ru.lesson3.homework.entity;

import ru.lesson3.homework.DoctorActions;

public class Neurosurgeon extends Surgeon implements DoctorActions {
    private Integer numberOfOperations;

    @Override
    public String toString() {
        return "Neurosurgeon{" +
                "name='" + name + '\'' +
                ", institute='" + institute + '\'' +
                ", age=" + age +
                ", numberOfOperations=" + numberOfOperations +
                ", experience=" + experience +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }

    @Override
    public void makeACut(String str) {
        System.out.println("Сейчас мы тебе порежем " + str);
    }

    ////////////////////////Builder//////////////////////////////

    public static class Builder {
        private Neurosurgeon newNeurosurgeon;

        public Builder() {
            newNeurosurgeon = new Neurosurgeon();
        }

        public Builder setName(String name) {
            newNeurosurgeon.name = name;
            return this;
        }

        public Builder setInstitute(String institute) {
            newNeurosurgeon.institute = institute;
            return this;
        }

        public Builder setExperience(Integer experience) {
            newNeurosurgeon.experience = experience;
            return this;
        }

        public Builder setAge(Integer age) {
            newNeurosurgeon.age = age;
            return this;
        }

        public Builder setNumberOfOperations(Integer numberOfOperations) {
            newNeurosurgeon.numberOfOperations = numberOfOperations;
            return this;
        }

        public Neurosurgeon build() {
            return newNeurosurgeon;
        }

    }
}
