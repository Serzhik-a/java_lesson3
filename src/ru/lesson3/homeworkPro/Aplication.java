package ru.lesson3.homeworkPro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {

        File file = new File("Testtext.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        StringBuilder output = new StringBuilder();
        output.append(InputAsk.readFromFile(scanner));
        if (output.toString().isBlank()) {
            System.out.println("Файл пустой");
        } else {
            System.out.println("Считанные данные: \n" + output);
        }
        scanner.close();
    }
}

