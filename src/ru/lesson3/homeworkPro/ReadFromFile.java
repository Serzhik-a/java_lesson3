package ru.lesson3.homeworkPro;

import java.util.Scanner;

public class ReadFromFile {
    public static StringBuilder readFromFile(Scanner scanner) {
        StringBuilder stringFromFile = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();
        Integer point = 0;
        boolean work = true;
        while (scanner.hasNextLine() && work) {                                                           //есть ли строчки еще
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
                if (UserDialog.dialog()) {                                                        //опрос пользователя
                    stringFromFile.append(tempStr, 0, point + 1);
                    tempStr.delete(0, point + 1);
                } else {
                    stringFromFile.append(tempStr.delete(point, tempStr.length()));
                    work = false;                                                                   //прекращаем поиск
                    break;
                }
            }
        }
        return stringFromFile;
    }
}
