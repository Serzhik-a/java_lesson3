package ru.lesson3.homework;

import ru.lesson3.homework.entity.*;


public class Application {
    public static void main(String[] args) {
        ReferenceBook referenceBook = new ReferenceBook.Builder()
                .setCode("216546")
                .setAuthor("Ivanov")
                .setTitle("Пролетая над гнездом шмеля")
                .setYear(2013)
                .setPublishingHouse("Маразм Int.")
                .build();

        Encyclopedia encyclopedia = new Encyclopedia.Builder()
                .setCode("687965")
                .setAuthor("Jamshut")
                .setTitle("Записки строителя")
                .setYear(2020)
                .setPublishingHouse("Asia ind.")
                .build();

        Model phone = new Model.Builder()
                .setVendor("Siemens")
                .setWeight(165)
                .setPrice(250)
                .setModelCode("S35")
                .setClass(PhoneClasses.MIDDLECLASS)
                .build();

        Neurosurgeon afanasij = new Neurosurgeon.Builder()
                .setName("Афанасий")
                .setAge(35)
                .setExperience(10)
                .setNumberOfOperations(2)
                .setInstitute("НГТУ")
                .build();

        referenceBook.showInfo();
        encyclopedia.showInfo();
        referenceBook.readPageBook(35);
        encyclopedia.readPageBook(56);
        referenceBook.showClass();
        encyclopedia.showClass();
        phone.showInfo();
        phone.showClass();
        afanasij.showInfo();
        afanasij.makeACut("печень");
    }

}

