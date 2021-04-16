package ru.lesson3.homeworkPro;

import java.util.Scanner;

public class UserDialog {
    public static boolean dialog() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Продолжить чтение? д/н: ");
            StringBuilder answer = new StringBuilder(input.nextLine());
            switch (answer.toString().toLowerCase()) {
                case "д": {
                    return true;
                }
                case "н": {
                    return false;
                }
                default: {
                    System.out.println("Некорректный ввод");
                }
            }
        }
    }
}
