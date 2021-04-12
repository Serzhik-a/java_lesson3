package ru.lesson3.homeworkPro;

import java.util.Scanner;

public class InputAsk {
    public static StringBuilder readFromFile(Scanner scanner) {
        StringBuilder stringFromFile = new StringBuilder();
        Scanner input = new Scanner(System.in);
        StringBuilder tempStr = new StringBuilder();
        Integer point = 0;
        while (scanner.hasNextLine()) {                                                           //есть ли строчки еще
            tempStr.append(scanner.nextLine());                                                   //читаем строку из файла
            while (!tempStr.toString().isEmpty()) {
                try {
                    NumberSearcher.searchNumberInString(tempStr);                                 //запускаем поиск цифр
                    stringFromFile.append(tempStr);                                               //не нашли - добавляем к итогу
                    tempStr.delete(0, tempStr.length());                                          //очищаем временную строку
                    stringFromFile.append("\n");                                                  //добавляем перенос строки
                    continue;
                } catch (FileReadNumberExeption fileReadNumberExeption) {
                    System.out.println(fileReadNumberExeption.getMessage());                      //сообщение о найденной цыфре
                    point = fileReadNumberExeption.getIndex();
                }
                while (true) {                                                                    //что делаем дальше
                    System.out.print("Продолжить чтение? д/н: ");
                    StringBuilder answer = new StringBuilder(input.nextLine());
                    switch (answer.toString().toLowerCase()) {
                        case "д": {
                            stringFromFile.append(tempStr, 0, point + 1);
                            tempStr.delete(0, point + 1);
                            break;
                        }
                        case "н": {
                            stringFromFile.append(tempStr.delete(point, tempStr.length()));
                            return stringFromFile;
                        }
                        default: {
                            System.out.println("Некорректный ввод");
                            continue;
                        }
                    }
                    break;
                }
            }
        }
        return stringFromFile;
    }
}
