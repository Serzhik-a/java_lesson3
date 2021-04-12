package ru.lesson3.homeworkPro;

public class NumberSearcher {

    public static StringBuilder searchNumberInString(StringBuilder str) throws FileReadNumberExeption {

        for (char c : str.toString().toCharArray()) {
            if (Character.isDigit(c)) {
                throw new FileReadNumberExeption("В файле найдена цифра " + c, str.toString().indexOf(c));
            }
        }
        return str;
    }
}
